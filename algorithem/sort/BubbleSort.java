package sort;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: BubbleSort
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-28 19:56
 */
public class BubbleSort {
    static Integer[] arr1;
    public static void main(String[] args) {

        arr1=new Integer[]{1,6,3,7,99,4,500,90};
        bubble_sort(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));
    }
   static void bubble_sort(Integer arr[], int len) {
       for(int i = 0; i < arr.length; i++){
           for(int j = i; j < arr.length-1; j++) {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
    }

}
