package JavaSE.String;

public class StrNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String  string  = new  String();
		String string="";
		//String string=null ;
		if (string.isEmpty()) {
			System.out.println("你好，字符串是空的");
		}
			
		if (string=="") {
			System.out.println("你好，字符串内容还是空的");
		}
		
		
		if (string==null) {
			System.out.println("你好，字符串对象还是空的");
		}
		

	}

}
