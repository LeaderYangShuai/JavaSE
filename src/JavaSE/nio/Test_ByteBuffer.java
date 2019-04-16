package JavaSE.nio;

import java.nio.ByteBuffer;

public class Test_ByteBuffer {  
    static int capacity1,limit1,position1;  

    public static void main(String[] args) throws Exception{  

    		byte[] b = "my123123test".getBytes();//获取字节数组 
    		ByteBuffer bytebuffer =ByteBuffer.allocate(1024);//定义一个buffer，并为之分配容量。  
    		
    		capacity1 = bytebuffer.capacity();//返回buffer容量  
    		limit1 = bytebuffer.limit();				//返回buffer界限  
    		position1 = bytebuffer.position();//返回buffer位置 

          /*没有设置mark（标记）， */  
    		System.out.println("没有放进去容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  
    		bytebuffer.put(b);//把字节放进buffer  
          
    		capacity1 = bytebuffer.capacity();//返回buffer容量  
    		limit1 = bytebuffer.limit();				//返回buffer界限  
    		position1 = bytebuffer.position();//返回buffer位置  
          /*没有设置mark（标记）， */  
         System.out.println("放进去后的容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");
         
         //bytebuffer.put();
     	capacity1 = bytebuffer.capacity();//返回buffer容量  
		limit1 = bytebuffer.limit();				//返回buffer界限  
		position1 = bytebuffer.position();//返回buffer位置  
      /*没有设置mark（标记）， */  
		
     System.out.println("get后进去的容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  
//           System.out.println((char)bytebuffer.get());
        //反转此缓冲区，从结果来看，我们知道，capacity不变，limit=position  ；position=0；  
         //此时的buffer感觉就像队列一样，先进先出。  
         bytebuffer.flip();  

         capacity1 = bytebuffer.capacity();  
          limit1 = bytebuffer.limit();  
          position1 = bytebuffer.position();  
         System.out.println("flip()后的容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  
         byte[] c = "mtest".getBytes();//获取字节数组  
         bytebuffer.put(c);
         capacity1 = bytebuffer.capacity();  
         limit1 = bytebuffer.limit();  
         position1 = bytebuffer.position();  
         System.out.println("再次放一个byte 【数组】的容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  
           
         bytebuffer.flip();
         capacity1 = bytebuffer.capacity();  
         limit1 = bytebuffer.limit();  
         position1 = bytebuffer.position();  
        System.out.println("再次flip（）容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  
         //重置此缓冲区，其实就是相当于刷新一下，通知buffer做好读或写的准备，并没有什么改变。  
         bytebuffer.rewind();  
         capacity1 = bytebuffer.capacity();  
          limit1 = bytebuffer.limit();  
          position1 = bytebuffer.position();  
         System.out.println("rewind后的容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  

         	//晴空缓冲区
         bytebuffer.clear();
         capacity1 = bytebuffer.capacity();  
          limit1 = bytebuffer.limit();  
          position1 = bytebuffer.position();  
         System.out.println("容量："+capacity1+"    界限："+limit1+"   位置： "+position1+"    mark:"+"需要自己设置");  
  
    }  
  
}  
