package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {


    /*
    与 ’15-三数之和‘ 一样使用双指针法求解
    不同的是三数之和只需要i一层循环，而此题需要i、j双层循环
    定义两个指针left和right，分别位于j+1和数组尾部
    i j left            right
    在这里，i、j、left、right四个指针相当于a、b、c、d四叔，计算四数之和
    若计算出四数之和 >target，此时right指针应该向左移动
    i j left        right
    若计算出四数之和 <target，此时left指针应该向右移动
    i j     left        right
    直至left与right相遇为止
    注：当四数之和 =target时，需判断left的右边、right的左边是否与当前相等，若相等，还需向右（向左移动）
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = nums.length - 1;
                while (right > left) {
                    if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        while (right > left && nums[left] == nums[left + 1])
                            left++;
                        while (right > left && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right--;
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
