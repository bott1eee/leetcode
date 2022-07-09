package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    /*
    15-三数之和
     */
    public static List<List<Integer>> threeSum(int[] nums) {

//        List<List<Integer>> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = nums.length - 1; j > i + 1; j--) {
//                for (int k = i + 1; k < j; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    }
//                }
//            }
//        }
//        return result;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                return result;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //易忽略，防止重复
                    while (right > left && nums[right] == nums[right - 1])
                        right--;
                    while (right > left && nums[left] == nums[left + 1])
                        left++;
                    right--;
                    left++;
                } else if (sum > 0)
                    right--;
                else if (sum < 0)
                    left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}).toString());
    }
}
