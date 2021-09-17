package array;

import com.sun.deploy.panel.JreTableModel;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int size = nums.length;
        for (int i = 0 ;i< size;i++){
            if (nums[i]==val){
                for (int j = i+1;j< size;j++){
                    nums[j-1] = nums[j];
                }
                size--;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,3,0,4,2};
        System.out.println(new RemoveElement().removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
}
