package jni;

public class HelloWorld {
	public native void displayHelloWorld();// 所有native关键词修饰的都是对本地的声明
	public native int displayHelloWorld(String pwd);
	static {
		System.loadLibrary("HelloWorld");// 载入本地库
	}

	public static void main(String[] args) {
		//HelloWorld.dll 存放的路径
//		System.out.println(System.getProperty("java.library.path")); 
		new HelloWorld().displayHelloWorld();
		int ss=new HelloWorld().displayHelloWorld("123");
		System.out.println(ss);
	}
}
