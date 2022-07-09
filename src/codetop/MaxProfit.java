package codetop;

public class MaxProfit {

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 4, 5, 3, 6, 2}));
    }
}
