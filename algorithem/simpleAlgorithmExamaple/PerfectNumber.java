package simpleAlgorithmExamaple;

import javax.xml.transform.Result;

/**
 * @ProjectName: javaSe_review
 * @ClassName: PerfectNumber
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 15:37
 *
 * 如果一个数恰好等于他的因子的和，则称为完数
 * 比如：6=1+2+3;则6是完数
 */
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(new PerfectNumber().isPerfectNum(24));
        new PerfectNumber().showPerfect();
    }
    public boolean isPerfectNum(int num ){
        boolean  b =false;
        int j = 2;
        int result = 1;
        while (j<num){
            if (num%j==0) {
                result += j;
            }
            j++;
        }

        if (num == result) {
            b = true;
        }
        return b;
    }

    public  void showPerfect(){
        for (int i = 2; i<10000;i++){
            if (isPerfectNum(i)){
                System.out.print(i+"  ");
            }
        }
    }
}
