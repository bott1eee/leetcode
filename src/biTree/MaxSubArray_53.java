package biTree;

public class MaxSubArray_53 {

    public static int maxSubArray(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int result = 0;
                for (int k = i; k <= j; k++) {
                    result += nums[k];
                }
                max = Math.max(max, result);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,-1}));
    }
}
