package sort.recursion;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Factorial
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-21 15:48
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
   static int fact(int n){
        if (n==1)
            return 1;
        return n*fact(n-1);
    }
}


