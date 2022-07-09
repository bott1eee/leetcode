package test;

import java.util.Scanner;

public class Fold {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n / 2; k++) {
                    nums[j][k] = nums[j][k] + nums[j][n - k - 1];
                    nums[j][n - k - 1] = 0;
                }
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n / 2; k++) {
                    nums[k][j] = nums[k][j] + nums[n - k - 1][j];
                    nums[n - k - 1][j] = 0;
                }
            }
            n = n / 2;
        }
        System.out.println(nums[0][0]);
    }
}
