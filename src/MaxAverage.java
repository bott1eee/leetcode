import java.util.Scanner;

public class MaxAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        double max_average = 0;
        double average = 0;
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                average = sum / (j - i + 1);
                if (max_average < average) {
                    max_average = average;
                }
            }
        }
        System.out.println((int)Math.floor(max_average));
    }
}
