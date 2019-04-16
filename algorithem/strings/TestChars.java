package strings;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: TestChars
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 08:01
 *
 *
 * final修饰数组的话，数组的内部地址是不可以改变的。
 */
public class TestChars {
    public static void main(String[] args) {
//          int [] aa = {1,2,4};
//          String a1="123";
//          a1="234";
//        int [] bb ={3,7,0};
//        System.out.println(Arrays.toString(aa));
//        aa=bb;
//        System.out.println(Arrays.toString(aa));

        final User user = new User();

        System.out.println(user.id);
        user.id=23;
        System.out.println(user.id);
    }
}
