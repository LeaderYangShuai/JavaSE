package sort.quickSort;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: QuickSort
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-20 20:38
 */
public class QuickSort {


   private static int [] array1 ;

    public static void main(String[] args) {
        array1 = new int[]{5,6,8,4,3,7,9};
        new QuickSort().quickSort(array1,0,array1.length-1);
        System.out.println(Arrays.toString(array1));

       // System.out.println( new QuickSort().partition(array,0,array.length-1));
    }

    public  int partition(int []array,int first,int end){

        int i =first;
        int j =end;
        while (i<j){
            while (i<j && array[i]<array[j])j--;
            if (i<j){
//                int temp = array[j];
//                array[j] = array[i];
//                array[i] = temp;
                Swap.swap(array1,i,j);
                i++;
            }
            while (i<j && array[i]<array[j])i++;
                if (i<j) {
//                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
                    Swap.swap(array1,i,j);
                    j--;
                }
        }
        return  i;
    }

    public void quickSort(int []array,int first,int end){
        if(first < end){
            int pos = partition(array,first, end);
            quickSort(array,first,pos-1);
            quickSort(array,pos+1,end);
        }
    }
}
