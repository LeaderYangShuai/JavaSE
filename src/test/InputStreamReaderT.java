package test;

import java.io.*;

/**
 * @ProjectName: javaSe_review
 * @ClassName: InputStreamReaderT
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 17:42
 *
 * 这个地方告诉我们，字符流（InputStreamReader和OutputStreamWriter）永远无法操作字节流，
 * 但是字节流可以操作字符流
 */
public class InputStreamReaderT {

    public static void main(String[] args) {
        BufferedReader bre = null;
        BufferedWriter bufferedWriter = null;
        try {
            bre = new BufferedReader(new InputStreamReader
                    (System.in));//此时获取到的bre就是整个文件的缓存流

            bufferedWriter = new BufferedWriter(new OutputStreamWriter
                    (new FileOutputStream("/home/yanghongbing/temp/images/cc.jpg")));
            String str ="";
            while ((str = bre.readLine())!= null) // 判断最后一行不存在，为空结束循环
            {
                System.out.println(str);//原样输出读到的内容
                bufferedWriter.write(str);
            };
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bre!=null){
                try {
                    bre.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
