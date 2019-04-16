package JavaSE.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ProjectName: JavaSE
 * @ClassName: ObjectOutputStreamTest
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-11-02 15:44
 */
public class ObjectOutputStreamTest  {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("红兵");
        person.setAge(12);
        try {
            ObjectOutputStream  objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("/home/yanghongbing/temp/objectstream.txt"));
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
class Person  implements Serializable {
    private  transient  String name;//加了transient之后就不能被序列化了
    private  int  age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}