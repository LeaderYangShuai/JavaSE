package test;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: ArrayTest
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-01 08:58
 */
public class ArrayTest {
    int [] arr;
    public static void main(String[] args) {
        new ArrayTest().dd();

    }

    public void dd() {
       arr = new int[12];
       arr[0]=14;
        System.out.println(arr[0]+"长度"+arr.length+arr[11]);
        System.out.println(Arrays.toString(arr));
    }
}
