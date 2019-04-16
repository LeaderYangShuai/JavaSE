package JavaSE.String;

public class StrSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  string = new String("abcdefg");
		String  string2 = string.substring(3, 5);
		String  string3 = string.substring(2);
		
		String string4 = "abcdefg";
		if (string.contains(string4)) {
			System.out.println("子串是包含的");
		}
		
		int  result = string.compareTo("2bb");
		System.out.println("result的值是"+result);
		//System.out.println("子串是"+string2+"		"+string3	);

	}

}
