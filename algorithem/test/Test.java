package test;

public class Test  extends P{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i =10;
//		int j = ++i  * 2  %  i++ +1;
//		System.out.println(j);
//		String  string ="   ";
//		System.out.println(string.length());
//		String string2 = new String();
//		System.out.println(string2.length());
//		
//		Map  hashMap = new HashMap();
	
		byte b ='a';
		System.out.print(b);
		  System.out.println(System.getProperty("user.language")); 
		  System.out.println(System.getProperty("file.encoding"));
		  Test  test = new Test();
		  test.speak();
	}
	//这里说明static的也是能够继承的
	public static void speak() {
		System.out.println("我会说renm话");
	}

}


class  P{
	protected static void speak() {
		System.out.println("我会说话");
	}
}
