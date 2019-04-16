package test;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Test1
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-13 09:56
 */
public class TestOne{
    public static void main(String[] args) {

    }
    public void radixSort(int[] A, int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (max < A[i]) max = A[i];
        }
        double d = Math.pow(10, String.valueOf(max).length());
        int k = 1;
        int[][] t = new int[10][n];
        //桶
        int[] num = new int[n]; //记录每个桶中存入数的个数
        while (k < d) {
            for (int a : A) {
                int m = (a / k) % 10;
                t[m][num[m]] = a;
                num[m]++;
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (num[i] != 0) {
                    for (int j = 0; j < num[i]; j++) {
                        A[c++] = t[i][j];
                    }
                }
                num[i] = 0;
            }
            k = k * 10;
        }
    }

}
