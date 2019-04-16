package simpleAlgorithmExamaple;

import test.HashMap;

import java.util.Arrays;

/**
 * @ProjectName: javaSe_review
 * @ClassName: TwoSum
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-22 11:11
 *
 * 给定一个数组，和一个值，求出数组中的那两个数相加可以的到这个值，返回数组的索引
 */
public class TwoSum {
    private HashMap hashMap = new HashMap();

    public static void main(String[] args) {

        int [] arr={2,7,1,2,8};
        System.out.println(Arrays.toString(new TwoSum().twoSum(arr,9)));

    }

//    public String twoSum(int [] arr,int target){
//
//        for (int i = 0;i<arr.length;i++){
//            hashMap.put(arr[i],i);
//        }
//        for (int j =0;j<arr.length;j++){
//            int temp =target-hashMap.get(j);
//            if(hashMap.containsKey(temp)&& hashMap.get(temp) != j){
//                return  "j"+hashMap.get(temp);
//            }
//        }
//
//        return -1+"";
//    }



        public int[] twoSum(int[] nums, int target) {
            HashMap m = new HashMap();
            int[] res = new int[2];
            for (int i = 0; i < nums.length; ++i) {
                m.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; ++i) {
                int t = target - nums[i];
                if ((int)m.get(t) != i)
                    if (m.containsKey(t)) {
                        res[0] = i;
                        res[1] = (int) m.get(t);
                        break;
                    }
            }
            return res;
        }

}
