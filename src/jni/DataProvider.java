package jni;

public class DataProvider {
	
	/**
	 * ����x��y�ļӷ�  apktools  
	 * 315 
	 * @param x
	 * @param y
	 * @return
	 */
	public native int add(int x ,int y);  // char   String   short   kiss  keep it simple and stupid  String[]  "123:234" 
	/**
	 * ���ַ�������ƴװ�ַ�  ��������   web   url  
	 * @param s
	 * @return
	 */
	public native String sayHelloInC(String s);
	//  
	/**
	 * ��c���봫��int����   ��c��������������в���
	 * ͼ�� �����Ĵ���
	 * @param iNum
	 * @return
	 */
	public native int[] intMethod(int[] iNum); 
	
	
	static{
		System.loadLibrary("hello");
	}
	
	public static void main(String[] args) {
		
		DataProvider provider =new DataProvider();
		int result=provider.add(3, 5);
		System.out.println(result);
		String str=provider.sayHelloInC(null);
		System.out.println(str);
		
		/*int[] arr=new int[]{1,2,3,4,5};
		provider.intMethod(arr);
		for(int i:arr){
			System.out.println(i);
		}*/
	}
}
