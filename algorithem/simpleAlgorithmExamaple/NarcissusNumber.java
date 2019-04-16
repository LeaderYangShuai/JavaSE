package simpleAlgorithmExamaple;

/**
 * @ProjectName: javaSe_review
 * @ClassName: NarcissusNumber
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 14:28
 *
 * 这道算法题说的是水仙花数，什么是水仙花数呢？
 * 水仙画数指的是一个三位树，各位数字之和是他的本身
 * 比如153就是一个水仙花数
 * 范围：100-1000
 */
public class NarcissusNumber {
    public static void main(String[] args) {

        new NarcissusNumber().showNarcissus();
    }
    public boolean isNarcissus(int num){
        boolean b =false;
        int i =num/100;
        int j = (num-i*100)/10;
        int k =  (num-i*100)%10;
        if(i*i*i+j*j*j+k*k*k==num)b=true;
        return b;
    }

    public void showNarcissus(){
        for (int i = 100;i<1000;i++){
            if (isNarcissus(i)){
                System.out.print(i+"  ");
            }
        }
    }
}
