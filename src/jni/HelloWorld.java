package jni;

public class HelloWorld {
	public native void displayHelloWorld();// ����native�ؼ������εĶ��ǶԱ��ص�����
	public native int displayHelloWorld(String pwd);
	static {
		System.loadLibrary("HelloWorld");// ���뱾�ؿ�
	}

	public static void main(String[] args) {
		//HelloWorld.dll ��ŵ�·��
//		System.out.println(System.getProperty("java.library.path")); 
		new HelloWorld().displayHelloWorld();
		int ss=new HelloWorld().displayHelloWorld("123");
		System.out.println(ss);
	}
}
