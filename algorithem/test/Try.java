package test;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Try
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-27 14:22
 */
public class Try {

    public static void main(String[] args) {
//        try {
//            return;
//        }finally {
//            System.out.println("你好");
//        }
        String string = "qwerthy";
        String []strings = string.split("");
        for(int i = 0;i<strings.length;i++){
            System.out.print(strings[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(strings));
    }
}
