package simpleAlgorithmExamaple;

/**
 * @ProjectName: javaSe_review
 * @ClassName: PrimeNumber
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 14:08
 *
 * 这道题是判断有多少个素数的题。首先我们要知道什么是素数？
 * 曾称质数。一个大于1的正整数，如果除了1和它本身以外，
 * 不能被其他正整数整除，就叫素数（质数）。如2，3，5，7，11，13，17…。
 */
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(new PrimeNumber().isPrimeNumber(7));
        new PrimeNumber().showPrime();
    }

    public boolean isPrimeNumber(int i){
        boolean b= false;
        int j=2;

        while (i%j!=0)j++;
        if(i==j){
            b=true;
        }
        return b;
    }

    public void showPrime(){
        for(int i=100;i<200;i++){
            if(isPrimeNumber(i)){
                System.out.print(i+"  ");
            }
        }
    }
}
