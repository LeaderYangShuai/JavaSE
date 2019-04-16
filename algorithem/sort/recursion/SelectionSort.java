package sort.recursion;

import sort.Swap;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: SelectionSort
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-21 07:24
 */
public class SelectionSort {

    static Integer arr[];

    public static void main(String[] args) {

        arr = new Integer[]{49,6,1,5,9,7,89};
        System.out.println(Arrays.toString(selectionSort(arr,arr.length,0)));
    }

    public static Integer[]  selectionSort(Integer []r,int n,int i){
        int minIndex = i;
        for(int j=i+1;j<n;j++){
            if (arr[j]<arr[minIndex]){
                minIndex = j;
            }
           // System.out.println(Arrays.toString(arr));
        }
            Swap.swap(arr,i,minIndex);
            //System.out.println(Arrays.toString(arr));
            while (i<n){
                i++;
                if (i<n)
                selectionSort(r,n,i);
                System.out.println(n+"  哈哈"+i);
            }
        return arr;
    }


}
