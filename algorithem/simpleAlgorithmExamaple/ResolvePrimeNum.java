package simpleAlgorithmExamaple;

/**
 * @ProjectName: javaSe_review
 * @ClassName: ResolvePrimeNum
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 14:48
 *
 * 分解质因数，将一个合数（不是质数的数），总能够分解成为几个质数相乘的形式
 * 叫做分解质因数。比如90=2×3×3×5
 */
public class ResolvePrimeNum {
    public static void main(String[] args) {

        new ResolvePrimeNum().resolvePrimeNum(90);
    }
    public boolean   isPrimeNumber(int i ){
        boolean b =false;
        int j = 2;
        while (i%j!=0){
            j++;
        }
        if(i==j)
            b=true;
        return b;
    }

    public void resolvePrimeNum(int num ){
        int j =2;

        while (j<=num){
            if (num%j==0){
                num = num/j;
                System.out.print(j+"  ");
            } else
                j++;
            while (!isPrimeNumber(j)){
                j++;
            }
        }
    }
}
