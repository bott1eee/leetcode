package hash;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] index = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target==nums[i]+nums[j]){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        return index;
    }

    /*
    使用hashtable方法求解
    初始化一个hashmap。遍历数组，寻找target-nums[i]是否在map中。若
    不在，则把nums[i]当前值存入map中，nums[i]作为map的key，i索引作为map的value；
    若存在，则表明i索引值和map的key值就是要求的目标值。
     */
    public int[] twoSum_hash(int[] nums,int target){

        int[] res = new int[2];
        if (nums == null || nums.length == 0)
            return res;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i< nums.length;i++){
            int temp = target-nums[i];
            if (map.containsKey(temp)){
                res[0] = i;
                res[1] = map.get(temp);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
