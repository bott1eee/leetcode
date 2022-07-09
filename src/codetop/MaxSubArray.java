package codetop;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                temp += nums[j];
                max = Math.max(max, temp);
            }
        }
        return max;
    }


    public int maxSubArray_2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int maxSubArray_3(int[] nums) {

        int pre = 0;
        int max = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            max = Math.max(max, pre);
        }
        return max;
    }
}
