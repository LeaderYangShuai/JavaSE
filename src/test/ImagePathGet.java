package test;

import utils.SqlHelper;

import java.io.*;
/**
 * @ProjectName: javaSe_review
 * @ClassName: ImagePathGet
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 16:40
 */
public class ImagePathGet {

    BufferedInputStream bufferedInputStream;
    FileInputStream fileInputStream;
    BufferedOutputStream bufferedOutputStream;
    FileOutputStream fileOutputStream;
    public static void main(String[] args) {

        File file = new File("/home/yanghongbing/Pictures");
//        String [] fileList = file.list();
//
//        for (int i = 0;i<fileList.length;i++){
//            System.out.println(fileList[i]);
//            String path =file.getAbsolutePath()+"/"+fileList[i];
//            String sql = "insert into imageDown values('"+path+"')";
//            System.out.println(path);
//            SqlHelper.insertImage(sql);
//        }

        ImagePathGet imagePathGet = new ImagePathGet();
        imagePathGet.readImage();
    }


    public void readImage(){
        try {
            fileInputStream = new FileInputStream
                    ("/vedios/视频/Linux视频教程（六）/韩顺平+linux视频教程01讲+基础介绍.wmv");
            bufferedInputStream =new BufferedInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream("/home/yanghongbing/temp/images/bbb.wmv");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte [] bytes = new byte[1024];
            int n =0;
            while ((n=bufferedInputStream.read(bytes))!=-1){
                System.out.println(n);
                bufferedOutputStream.write(bytes,0,n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
