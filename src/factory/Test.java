package factory;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println(findRepeatNumber_2(new int[]{1, 3, 2, 0, 2, 5, 3}));
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1]){
//                System.out.println(nums[i]);
//            }
//        }
    }

    public static int findRepeatNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }

    public static int findRepeatNumber_2(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
