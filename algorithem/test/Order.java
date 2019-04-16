package test;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Order
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-14 16:01
 */
public class Order {
    static  int []arr ;
    public static void main(String[] args) {
        arr = new int [5];
        for(int k =0;k<5;k++){
            arr[k]=(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        delete(2);
        System.out.println(Arrays.toString(arr));


    }
    public static void delete (int i){
        for(int j =i;j<arr.length;j++){
            arr[j-1]=arr[j];
        }
    }
}
