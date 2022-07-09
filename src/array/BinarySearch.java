package array;

public class BinarySearch {

    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1])
            return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public int search_2(int[] nums, int target) {

        if (target<nums[0]|| target>nums[nums.length-1])
            return -1;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (target<nums[mid]){
                right = mid-1;
            }else if (target>nums[mid]){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
