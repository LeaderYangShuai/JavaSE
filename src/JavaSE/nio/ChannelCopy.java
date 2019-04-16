package JavaSE.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class ChannelCopy extends Thread{

	//Runnable
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Charset charset = Charset.defaultCharset();
		try {
			FileChannel  in = new FileInputStream
					("/home/yanghongbing/temp/NewTest/a.txt").getChannel();
			FileChannel out = new FileOutputStream
					("/home/yanghongbing/temp/NewTest/nioA.txt").getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			//CharBuffer buffer = buffer1.asCharBuffer();

			while(in.read(buffer)!=-1) {
				System.out.println("限制是"+buffer.limit()+"位置是"+buffer.position()+"容量是"+buffer.capacity());
			    buffer.flip();//如果没有这个，根本度不了，从缓冲区中读取已经写入的文件
				System.out.println("限制是"+buffer.limit()+"位置是"+buffer.position()+"容量是"+buffer.capacity());
				//下面的这个用于解码
//				String encode = System.getProperty("file.encoding");
//				System.out.println(Charset.forName(encode).decode(buffer));
				//System.out.println(buffer.asCharBuffer().toString());
				while (buffer.hasRemaining()) {
////					buffer.rewind();
//					System.out.println(buffer.hasRemaining());
//					System.out.println(charset.decode(buffer));
//				//	System.out.print((char)buffer.get(buffer.position(),buffer.limit()));
//					System.out.println("Hello");
//					System.out.println(buffer.hasRemaining());
					buffer.mark();
					out.write(buffer);
					System.out.println(buffer.position());

					buffer.reset();
					System.out.println(buffer.position());
					//buffer.rewind();
					System.out.println(charset.decode(buffer));
					//System.out.print((char)buffer.get());
					//System.out.println(buffer.asCharBuffer());
				}
			//	buffer.flip();//如果没有这个，根本度不了，从缓冲区中读取已经写入的文件
			//	out.write(buffer);
				buffer.clear();//如果没有这个，则会将原先的一值保存在缓冲中
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
