package JavaSE.JAVA_IO;

import java.io.File;

public class FileTest {

	File file  = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileTest fileTest = new FileTest();
		String []  strings = fileTest.getFileList();
//		for(String string : strings) {
//			System.out.println(string);
//		}
		System.out.println("文件的绝对路径是"+fileTest.getFilePath());
		File [] files = fileTest.getMultiFilePath();
		for (File files1:files) {
			System.out.println(files1.getAbsolutePath()+files1.getName());
		}

	}
	public FileTest() {
		// TODO Auto-generated constructor stub
		file = new File(".");
	}
	public String [] getFileList (){
		return file.list();
	}
	public  String getFilePath() {
		return file.getAbsolutePath();
	}
	
	public File [] getMultiFilePath() {
		return  file.listFiles();
	}
	

}
