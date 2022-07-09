package codetop;

public class Trap {

    public int trap(int[] height) {

        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int maxleft = height[i];
            int maxright = height[i];
            for (int j = i - 1; j > 0; j--) {
                maxleft = Math.max(maxleft, height[j]);
            }
            for (int k = i + 1; k < height.length; k++) {
                maxright = Math.max(maxright, height[k]);
            }
            int capacity = Math.min(maxleft,maxright) - height[i];
            if (capacity > 0) {
                sum += capacity;
            }
        }
        return sum;
    }
}
