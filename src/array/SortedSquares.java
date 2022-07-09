package array;

import java.util.Arrays;

public class SortedSquares {

    //暴力求解法
    //先计算数组平方，在对其进行排序
    public int[] sortedSquared(int[] nums) {

        //平方
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        //排序
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    //双指针法
    //两个指针分别指向排序数组的头尾部，再判断两者的平方大小，大者写入结果数组的尾部
    public int[] sortedSquares_2(int[] nums) {

        int result[] = new int[nums.length];
        int k = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[k] = nums[i] * nums[i];
                k--;
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                k--;
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {2,1,5,3,11,9};
//        for (int i=0;i< nums.length;i++){
//            for (int j = i+1;j< nums.length;j++){
//                if (nums[i]>nums[j]){
//                    int temp = nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(new SortedSquares().sortedSquared(nums)));
        System.out.println(Arrays.toString(new SortedSquares().sortedSquares_2(nums)));
    }

    public int[] sorted(int[] nums) {

        int k = nums.length;
        int[] result = new int[nums.length];
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return result;
    }
}
