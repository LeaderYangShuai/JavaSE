package singleLinkedList;

/**
 * @ProjectName: JavaSE
 * @ClassName: WrapSelf
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-26 15:02
 *
 * 这种情况下会导致栈溢出异常，也就是自己包装自己导致的问题
 */
public class WrapSelfTest {

    private WrapSelfTest wrapSelf = new WrapSelfTest();
    private  String name;

    public static void main(String[] args) {
        WrapSelfTest wrapSelfTest1 = new WrapSelfTest();
    }


}
