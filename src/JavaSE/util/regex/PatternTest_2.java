package JavaSE.util.regex;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public class PatternTest_2 {
	
	private Pattern pattern = null;
	//private Scanner scanner =null;
	private  InputStream inputStream;
	private BufferedInputStream bufferedInputStream = null;
	public static void main(String[] args) throws IOException {

		PatternTest_2 patternTest = new PatternTest_2();
		String regexString="";
		//我们可以获得一个Scanner对象
		while (!regexString.equals("q")) {
			System.out.println("请输入要匹配的字符串");
			byte [] b = new byte[512];
			int n=patternTest.getInputStream().read(b);
		//	patternTest.bufferedInputStream.read(b, 0, n);
			//System.out.println(n);
			regexString=new  String(b,0,n-1);
	//		System.out.println(regexString);
			
			if (!regexString.equals("q")) {
				boolean  bool = patternTest.isPattern(regexString);
				if (bool) {
					System.out.println("匹配");
				}else {
					System.out.println("不匹配");
				}
			}	
		} 
		patternTest.closeInputStream();
		System.out.println("退出");
	}
	public  BufferedInputStream  getInputStream() {
		//return this.scanner;
		return this.bufferedInputStream;
	}
	public PatternTest_2() {
		pattern = Pattern.compile(".*.java.*");	
		//scanner = new Scanner(System.in);
		inputStream = System.in;
		bufferedInputStream = new BufferedInputStream(inputStream);
	}
	public  boolean  isPattern(String string) {
	//	boolean b = pattern.matcher(string).lookingAt();
		boolean b = pattern.matcher(string).find();

		//System.out.println( pattern.matcher(string).toMatchResult().group());
		return  b ;
	}
	public  void closeInputStream() {
						try {
							if (bufferedInputStream!=null) {
								this.bufferedInputStream.close();
							}
						
						} catch (IOException e) {
							e.printStackTrace();
						}
	
							try {
								if (inputStream!=null) {
									this.inputStream.close();
								}
							
							} catch (IOException e) {
								e.printStackTrace();
							}
	}
}
