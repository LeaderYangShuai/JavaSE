package test;

import utils.SqlHelper;

import java.io.*;

/**
 * @ProjectName: javaSe_review
 * @ClassName: FilePath
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 12:35
 */
public class FilePath {


    FileReader fileReader;
    BufferedReader bufferedReader;
    File file;
    public static void main(String[] args) {

//        File
//        System.out.println(f.getAbsolutePath());
       FilePath filePath = new FilePath();
//       filePath.readName();

       filePath.testPath();
    }

    public void readName(){
        try {
            file =new File("/home/yanghongbing/temp/JavaFile/name.txt");
            bufferedReader = new BufferedReader(new FileReader(file));
            String string="";
            while ((string=bufferedReader.readLine())!=null){
                System.out.println(string);
                String sql ="insert into user(username) values('"+string+"')";
                SqlHelper.insert(sql);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (file!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void testPath(){
        System.out.println(this.getClass().getResource("/"));
    }
}
