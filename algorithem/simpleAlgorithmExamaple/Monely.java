package simpleAlgorithmExamaple;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Monely
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 09:19
 *
 * 问题描述：有1块，5块，2块的组成10块有多少种解法
 * 这个算法用到的是穷举的思想
 *
 *
 * 如果把这个问题变形，变成贪婪思想的话，
 * 求获取到的种类按照面币金额最大的一种方法的话。
 */
public class Monely {

    public static void main(String[] args) {

        System.out.println("总的方法种类"+new Monely().moneyCount());
        System.out.println("贪婪的思想是"+new Monely().greedyMoney());

    }

    public  int  moneyCount(){
        int i=0,j=0,k=0,count=0;

        System.out.println("1块  "+"2块  "+" 5块");
        for ( i =0;i<=10/1;i++){
            for (j=0;j<=10/2;j++){
                for (k=0;k<=10/5;k++)
                    if (k*5+j*2+i*1==10){
                        count++;
                        System.out.println(i+"      "+j+"       "+k);
                    }
            }
        }
        return count;
    }


    public  String   greedyMoney(){
        int sumMoney=18;
        int i=0,j=0,k=0;

        i = (sumMoney/5);
        if (sumMoney%5==0){
             return "i="+i+"    ";
        }
        sumMoney=sumMoney%5;

        j = (sumMoney/2);
        if (sumMoney%2==0){
            return "i="+i+"  j="+j;
        }
        sumMoney=sumMoney%2;

        k = (sumMoney/1);
        return  "i="+i+"   j="+j+"      k="+k;

    }

}
