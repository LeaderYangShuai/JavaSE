package simpleAlgorithmExamaple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ProjectName: javaSe_review
 * @ClassName: InverseArray
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 18:00
 *
 * 这是一道反转数组的题目
 * 就是说将数组的某一个片段截取下来之后反转如果使得数组有序，则输出yes
 * 否则的话输出no
 */
public class InverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        int[] copy = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            copy[i] = arr[i];
        }

        Arrays.sort(copy);

        int left = 0;
        while (arr[left] == copy[left] && left < len) {
            left++;
        }

        int right = len - 1;
        while (arr[right] == copy[right] && right >= 0) {
            right--;
        }
        int leftCopy = left;
        while ( right >= 0 && left < len  && arr[right] == copy[left] ) {
            left++;right--;
        }
        if (right == leftCopy-1) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }
}