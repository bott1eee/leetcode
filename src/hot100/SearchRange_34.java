package hot100;

import java.util.Arrays;

public class SearchRange_34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};

        for (int i = 0;i<nums.length;i++){
            if (nums[i]==target){
                result[0] = i;
                break;
            }
        }

        for (int j = nums.length-1;j>=0;j--){
            if (nums[j]==target){
                result[1]=j;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));
    }
}
