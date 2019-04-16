package JavaSE.util.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest_1 {
	
	private Pattern pattern = null;
	private Scanner scanner =null;
	
	public static void main(String[] args) {

		PatternTest_1 patternTest = new PatternTest_1();
		String regexString="";
		//我们可以获得一个Scanner对象
		do {
			System.out.println("请输入要匹配的字符串");
			regexString=patternTest.getScanner().nextLine().trim();
			if (!regexString.equals("")) {
				boolean  bool = patternTest.isPattern(regexString);
				if (bool) {
					System.out.println("匹配");
				}else {
					System.out.println("不匹配");
				}
			}
				
		} while (!regexString.isEmpty());
		
		System.out.println("退出");
	}
	public  Scanner  getScanner() {
		return this.scanner;
	}
	public PatternTest_1() {
		pattern = Pattern.compile(".*.java.*");	
		scanner = new Scanner(System.in);
	}
	public  boolean  isPattern(String string) {
		boolean b = pattern.matcher(string).matches();
		System.out.println(b);
		return  b ;
	}
	

}
