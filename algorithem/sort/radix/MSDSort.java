package sort.radix;

/**
 * @ProjectName: javaSe_review
 * @ClassName: MSDSort
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-13 09:59
 */
public class MSDSort {
    public int[] sort(int[] A, int n){
        int max = A[0];
        for(int i = 1 ;i < n;i++){
            if(max < A[i])
                max = A[i];
        }
        int maxL = String.valueOf(max).length();  //获取数组中最长元素长度

        int k = new Double(Math.pow(10, maxL - 1)).intValue();
        int[][] t = new int[10][n];  //桶
        int[] num = new int[n];      //记录每个桶中存入数的个数

        for(int a : A){              //按最高位入桶
            int m = (a / k) % 10;
            t[m][num[m]] = a;
            num[m]++;
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(num[i] == 1){        //如果桶中只有一个数则直接取出
                A[c++] = t[i][0];
            }else if(num[i] > 1){   //如果桶中不止一个数，则另存如数组B递归
                int[] B = new int[num[i]];
                for(int j = 0;j < num[i];j++){
                    B[j] = t[i][j];
                    sort(B,num[i]);   //递归方法
                }
            }
        }
        return A;
    }
    public static void main(String[] args) {
        RadixSort r = new RadixSort();
        int[] A = {12,1,23,123,34};
        //r.sort(A, A.length);
        for(int a : A){
            System.out.println(a);
        }

    }

}




