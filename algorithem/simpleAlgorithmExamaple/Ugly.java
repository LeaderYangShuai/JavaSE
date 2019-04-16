package simpleAlgorithmExamaple;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Ugly
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-12 08:33
 *
 * 丑数的算法：也就是一个数只有2,3,5最小因子。
 * 判断这个数是不是丑数，并且求出第n个丑数。
 */
public class Ugly {
    public static void main(String[] args) {
        Ugly ugly = new Ugly();
        if (ugly.isUgly(36)){
            System.out.println("是丑数");
        }else{
            System.out.println("不是丑数");
        }
        System.out.println(ugly.findUgly(21));
    }

    public boolean isUgly(int number){
        while (number % 2 == 0){
            number = number / 2;
        }
        while (number %3 ==0){
            number = number /3;
        }
        while (number % 5 ==0){
            number = number / 5;
        }

        if(number == 1){
            return  true;
        }else{
            return false;
        }
    }

    public int findUgly(int N){
        int count = 0;
        int number1 =1;
        while (true){
            if(isUgly(number1)){
                count++;
            }
            if(count == N){
                System.out.println("num="+number1);
                break;
            } else{
                number1++;
            }
        }
        return number1;

    }
}
