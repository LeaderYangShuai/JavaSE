package JavaSE.JAVA_IO;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class URLFileDown {

    URL url;
    ReentrantLock rc;
   ConcurrentHashMap concurrentHashMap;
    public static void main(String[] args) {
        new URLFileDown().downloadNet();
    }

    public void downloadNet() {
        StringBuffer  stringBuffer;
        ConcurrentHashMap concurrentHashMap;
        // 下载网络文件
        int bytesum = 0;
        try {
            url = new URL("http://statics.itc.cn/web/static/images/pic/sohu-logo/logo-57.png");
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            URLConnection conn = url.openConnection();
            InputStream inputStream = conn.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream
                    ("/home/yanghongbing/edf.png");

            byte[] bytes = new byte[1204];
            int length;
            while ((length = inputStream.read(bytes)) != -1) {
                bytesum += length;
                System.out.println(bytesum);
                fileOutputStream.write(bytes, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}