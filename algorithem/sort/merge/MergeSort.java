package sort.merge;

import java.util.Arrays;

/**
 * @ProjectName: javaSE
 * @ClassName: MergeSort
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-22 11:26
 */
public class MergeSort {
    public static void main(String []args){
        int []arr = {3,4,75,9,0,7,1,2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int []temp){
        int mid = (left+right)/2;
        if(left<right){

         //   System.out.println("nimabi"+"左边"+left+"   mid="+mid+"右边="+right);
            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
         //   System.out.println("你好,"+"左边"+left+"   mid="+mid+"右边="+right);
            //merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
            sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
        //    System.out.println("我很好");
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int k = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[k++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[k++] = arr[j++];
        }
        k = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[k++];
        }
    }
}
