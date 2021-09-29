package array;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                size--;
            }
        }
        return size;
    }


    public int removeElement_2(int[] nums, int val) {

        int slowIndex = 0;
        int fastIndex = 0;

        for (; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        int[] nums_1 = {0, 1, 2, 3, 3, 0, 4, 2};
        System.out.println(new RemoveElement().removeElement(nums_1, 2));
        System.out.println(Arrays.toString(nums_1));

        int[] nums_2 = {0, 1, 2, 3, 3, 0, 4, 2};
        System.out.println(new RemoveElement().removeElement_2(nums_2, 2));
        System.out.println(Arrays.toString(nums_2));
    }
}

