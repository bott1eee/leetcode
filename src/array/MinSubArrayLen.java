package array;

public class MinSubArrayLen {

    //暴力求解法
    //双层 for 循环寻找符合条件的子序列
    public int minSubArrayLen(int target, int[] nums) {

        int max_length = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = 1;
            int sum = nums[i];
            if (nums[i] >= target) {
                return 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                length++;
                if (sum >= target) {
                    if (max_length == 0)
                        max_length = length;
                    if (max_length > length)
                        max_length = length;
                    break;
                }
            }
        }
        return max_length;
    }

    //暴力求解法_2
    public int minSubArrayLen_2(int target, int[] nums) {

        int max_length = 0;
        int sum = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    length = j - i + 1;
                    if (max_length == 0)
                        max_length = length;
                    else if (max_length > length)
                        max_length = length;
                }
            }

        }
        return max_length;
    }

    //滑动窗口法（双指针法）
    //定义左右指针。先右移右指针直至左右指针所包含的中间序列的值大于 target，然后右移左指针使其所包含的序列长度变小，观察是否依然大于 target。
    //此过程直至右指针移至数组尾部截止。
    public int minSubArrayLen_3(int target, int[] nums) {

        int max_length = 0;
        int sum = 0;
        int length = 0;
        //左右指针
        for (int left = 0, right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                length = right - left + 1;
                if (max_length == 0)
                    max_length = length;
                else if (max_length > length)
                    max_length = length;
                //右移左指针，并使 sum 减去左指针当前值
                sum -= nums[left++];
            }
        }
        return max_length;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(new MinSubArrayLen().minSubArrayLen(7, nums));
        System.out.println(new MinSubArrayLen().minSubArrayLen_2(7, nums));
        System.out.println(new MinSubArrayLen().minSubArrayLen_3(7, nums));
    }

    public int minLength(int target, int[] nums) {

        int min_length = 0;
        int length = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            length = 1;
            sum = nums[i];
            if (nums[i] >= target) {
                return 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                length++;
                if (sum >= target) {
                    if (min_length == 0)
                        min_length = length;
                    if (min_length > length)
                        min_length = length;
                    break;
                }
            }
        }
        return min_length;
    }

    public int slide(int target, int[] nums) {
        int min_length = 0;
        int length = 0;
        int sum = 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                length = right - left + 1;
                if (min_length == 0 || min_length > length)
                    min_length = length;
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return min_length;
    }
}
