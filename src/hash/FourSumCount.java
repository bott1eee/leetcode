package hash;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    /*
    利用哈希表求解
    定义一个map，遍历数组a和数组b，key存放数组a、数组b两数之和，value存放数组a、数组b两数之和出现的次数
    遍历数组c和数组d，若 0-（c+d）在map中出现过，就将map中对应的value值也就是次数加上
     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                map.put(i + j, map.getOrDefault(i + j, 0) + 1);
            }
        }
        for (int m : nums3) {
            for (int n : nums4) {
                if (map.containsKey(-m-n)){
                    count+=map.get(-m-n);
                }
            }
        }
        return count;
    }
}
