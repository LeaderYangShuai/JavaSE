package test.staticObject;

import java.net.SocketTimeoutException;

/**
 * @ProjectName: JavaSE
 * @ClassName: Test
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-25 15:24
 */
public class Test {
    private  static One one;

    public static void main(String[] args) {
       Test test = new Test();
    }

    static {
        one = new One();
        one.setId(7);
        System.out.println(one.getId());
        one = new One();
        one.setId(12);
        System.out.println(one.getId());
    }
}
