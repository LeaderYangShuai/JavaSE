package JavaSE.JAVA_IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class FileNameFilterTest  implements FilenameFilter {

	static File file =null;
	Pattern pattern = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileNameFilterTest fileNameFilterTest = new FileNameFilterTest();
		if (fileNameFilterTest.accept(file, "bin")) {
			System.out.println("nihao");
		}

	}
	 public FileNameFilterTest() {
		// TODO Auto-generated constructor stub
		file = new File(".");
		pattern = Pattern.compile("b*");
	}

	@Override
	public boolean accept(File paramFile, String paramString) {
		// TODO Auto-generated method stub
		return pattern.matcher(paramString).matches();
	}

}
