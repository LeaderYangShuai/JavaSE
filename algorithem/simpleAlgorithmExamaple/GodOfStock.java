package simpleAlgorithmExamaple;
import java.util.Scanner;
/**
 *
 * 股神问题的求解：
 * 经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：
 * 第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
 */
public class GodOfStock {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int day = scanner.nextInt();

            int price = 1;
            int incCount = 1;  //上涨的总的次数
            int inc = 0;       //上涨的次数
            int today = 1;

            while(today != day){
                if(inc < incCount){
                    price++;
                    inc++;
                } else{
                    price--;
                    inc = 0;
                    incCount++;
                }
                today++;
            }
            System.out.println(price);
        }
    }
}