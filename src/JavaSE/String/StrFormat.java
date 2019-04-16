package JavaSE.String;

import java.util.Date;

public class StrFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		System.out.printf("%tF 	",date);
		System.out.printf("%tT%n",date);
		

	}

}
