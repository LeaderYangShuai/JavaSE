package simpleAlgorithmExamaple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: javaSe_review
 * @ClassName: DivisiorAndMulti
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 15:10
 *
 * 这道题目是来求解俩个数的最大公约数和最小公倍数的
 */
public class DivisiorAndMulti {
    private List list  = new ArrayList();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DivisiorAndMulti().disivisorAndMuliti(8,8)));
    }

    public  int [] disivisorAndMuliti(int num1,int num2){

        int [] res = new int[2];
        res[0]= 1;
        int j =2;
        int count1= num1;
        int count2 =num2;
        while (j<num1 || j<num2){
            if (num1%j==0 && num2%j==0){
                num1 = num1/j;
                num2 = num2/j;
                list.add(j);
            }else
                j++;

        }
        for (int i= 0;i<list.size();i++){

            res[0]*=(int) list.get(i);
        }

        int nn  = count1/res[0];

        int k = count2/res[0];

        res[1]= res[0]*nn*k;

        return res;
    }
}
