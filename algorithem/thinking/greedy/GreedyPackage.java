package thinking.greedy;

/**
 * @ProjectName: javaSe_review
 * @ClassName: GreedyPackage
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-21 17:28
 */

import java.util.Arrays;

/**
 *         假定有6个物品，他的质量分别是｛35，30，60，50，40，10，25｝kg
 *         他们的价格分别是｛10，40，30，50，35，40，30｝元。
 *         如果只能带走150kg的东西，你应该如何选择？
 *         我们知道，可以通过性价比来进行判断。所以我们可以通过求出性价比，然后排序性价比，
 *         然后从性价比最大的开始选择，直到装满为止。这就是贪心算法的思路。
 */
public class GreedyPackage {
    //定义最大负重，weight数组保存重量，values数组保存价值
    public int max_weight = 150;
    public static int[] weight ;
    public static int[] value;

    public static void main(String[] args) {
        weight = new int[] {35,30,60,50,40,10,25};
        value = new int[] {10,40,30,50,35,40,30};

        System.out.println("旧的重量"+Arrays.toString(weight));
        System.out.println("旧的价值"+Arrays.toString(value));
        GreedyPackage greedyPackage = new GreedyPackage();
        greedyPackage.greedyPackage(greedyPackage.max_weight, weight, value);
    }

    public void greedyPackage(int capacity, int[] weight , int[] value) {
        //性价比数组创建并排序
        int n = weight.length;//总个数
        double[] price = new double[n];//性价比数组
        int count[] = new int[n];//序号数组

        //求性价比
        for (int i = 0; i < n; i++) {
            price[i] = (double)value[i] / weight[i];
            count[i] = i;
        }

        //性价比排序
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (price[j] < price[j + 1]) {
                    double tmp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = tmp;
                    //交换性价比排序后，再吧序号交换,方便之后取数
                    int a = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = a;
                }
            }
        }
        System.out.println("性价比是"+Arrays.toString(price));
        System.out.println("序号是"+Arrays.toString(count));
        //把质量和价值也按照性价比的排序顺序对应好，存到新数组里
        int newWeight[] = new int[n];
        int newValue[] = new int[n];
        for (int i = 0; i < n; i++) {
            newValue[i] = value[count[i]];
            newWeight[i] = weight[count[i]];
        }

        System.out.println("新的重量"+Arrays.toString(newWeight));
        System.out.println("新的价值"+Arrays.toString(newValue));
        double maxValue = 0;
        //装东西，优先拿性价比高的
        for (int i = 0; i < n; i++) {
            if (capacity > newWeight[i]) {
                capacity -= newWeight[i];
                maxValue += newValue[i];
            }
        }

        System.out.print("共放下了" + (max_weight - capacity) +"kg重的东西\n");
        System.out.print("总价值" + maxValue);
    }
}

