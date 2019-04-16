package sort.quickSort;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Swap
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-21 08:39
 */
public class Swap {
    static  int arr[]={1,2};
    public static void main(String[] args) {
        Integer m =0;
        Integer n =1;
        swap(arr,m,n);
        System.out.println("m="+m+"  n="+n);
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] data, int a, int b) {
        int t = data[a];
        data[a] = data[b];
        data[b] = t;
    }
}
