package doublePointer;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }

    public int removeElement_2(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
