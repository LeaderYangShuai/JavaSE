package sort;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Swap
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-22 10:36
 */
public class Swap {
    public static void swap(Object[] data, int a, int b) {
        Object temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
