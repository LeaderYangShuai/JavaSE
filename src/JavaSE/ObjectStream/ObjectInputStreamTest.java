package JavaSE.ObjectStream;

import com.sun.media.sound.SoftTuning;

import java.io.*;

/**
 * @ProjectName: JavaSE
 * @ClassName: ObjectInputStreamTest
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-11-02 15:43
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("/home/yanghongbing/temp/objectstream.txt"));
           Person person =(Person)  objectInputStream.readObject();
           System.out.println(person.getName()+person.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
