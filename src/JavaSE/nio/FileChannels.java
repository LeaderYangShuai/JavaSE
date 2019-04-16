package JavaSE.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannels {

	FileChannel fileChannel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	 public FileChannels() throws Throwable {
		// TODO Auto-generated constructor stub
		 String filePath="/home/yanghongbing/NewTest/a.txt";
		 fileChannel = new FileInputStream(new File(filePath)).getChannel();
		 ByteBuffer buffer =ByteBuffer.allocate(1024);
        fileChannel.read(buffer);
	 
	 }
}
