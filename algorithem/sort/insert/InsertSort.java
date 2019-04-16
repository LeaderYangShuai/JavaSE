package sort.insert;

/**
 * @ProjectName: javaSe_review
 * @ClassName: InsertSort
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-22 10:26
 */

import sort.Swap;

import java.util.Arrays;

/**
 * 插入排序的先从数组索引为1的开始,与前面的数进行比较,如果小于前面的
 * 则交换位置,否则跳出循环
 *
 */
public class InsertSort {
    public static void main(String[] args) {

        Integer [] arr = {1,5,3,7,9,0};
        insert(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void insert(Integer []arr,int n) {
        for (int i =1;i<n;i++){
            for (int j = i; j >0; j--) {
                if (arr[j] < arr[j-1]) {
                    Swap.swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }

    }
}
