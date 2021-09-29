package array;

import java.util.Arrays;

public class SortedSquares {

    public int[] sortedSquared(int[] nums){

        for (int i = 0;i< nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for (int i = 0;i< nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public int[] sortedSquares_2(int[] nums){

        int result[] = new int[nums.length];
        int k = nums.length-1;
        for (int i = 0,j = nums.length-1;i<=j;){
            if (nums[i]*nums[i]>nums[j]*nums[j]){
                result[k]=nums[i]*nums[i];
                k--;
                i++;
            }else {
                result[k]=nums[j]*nums[j];
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
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(new SortedSquares().sortedSquared(nums)));
        System.out.println(Arrays.toString(new SortedSquares().sortedSquares_2(nums)));

    }
}
