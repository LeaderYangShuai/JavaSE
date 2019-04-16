package thinking.recurrence;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Fibonacci
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-21 19:00
 */

/**
 * 由一对兔子开始,一年后可以繁殖成多少对兔子?
 * 假定每对大兔每月能生产一对小兔，而每对小兔生长两个月就成为大兔.
 * 这个问题导致了著名的数列:1,1,2,3,5,8,13,21,34,55,89,144,233,
 * 它是一个线性递归数列，其前两项是F, = F:一1，而递归关系式是F=F，一+F,一:<n)3).
 * 这个数列一般称为斐波那契数列，它的每一项称为斐波那契数
 */
public class Fibonacci {

   static int count=0;
    public static void main(String[] args) {
       // testFibonacci(4);
        System.out.println("递归算法是"+fibonacciRecur(4));
      //  System.out.println(count);
    }
    //斐波拉契的递推的表现形式
    public static void testFibonacci(int n) {
        //i表示的是月份数,
        int first = 1, second = 2;
        int twoAgo = 0;
        int oneAgo = 0;
        int sum =0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("第" + i + "等于" + first);//首先声明第一个月的兔子数量是1,
            } else if (i == 2) {
                System.out.println("第" + i + "等于" + second);//然后第2个月的兔子数量是2
            } else {
                if (i==3){
                    twoAgo = first;
                    oneAgo = second;
                }
                   sum = twoAgo + oneAgo;
                twoAgo = oneAgo;
                oneAgo = sum;
                System.out.println("第" + i + "等于" + sum);
            }
        }
    }


    public static int fibonacciRecur(int n) {
        //i表示的是月份数,
        System.out.println("调用"+n);
            if (n == 1) {
               return  1;
            }
            if (n == 2) {
               return  2;
            }
            int j =fibonacciRecur(n-1)+  fibonacciRecur(n-2);
            return j;
    }

}
