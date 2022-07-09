package hot100;

public class MaxArea_11 {

    /*
    11-盛最多的水
     */
    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int max_result = 0;
        while (left<right){
            int result = Math.min(height[left],height[right])*(right-left);
            max_result = Math.max(max_result,result);
            if (height[left]<=height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max_result;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
