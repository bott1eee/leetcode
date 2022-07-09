import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        int score = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] == 0) {
                    if (i > 0) {
                        for (int up = i - 1; up >= 0; up--) {
                            if (nums[up][j] == 1) {
                                score++;
                                break;
                            }
                        }
                    }
                    if (i < n - 1) {
                        for (int down = i + 1; down <= n - 1; down++) {
                            if (nums[down][j] == 1) {
                                score++;
                                break;
                            }
                        }
                    }
                    if (j > 0) {
                        for (int left = j - 1; left >= 0; left--) {
                            if (nums[i][left] == 1) {
                                score++;
                                break;
                            }
                        }
                    }
                    if (j < m - 1) {
                        for (int right = j + 1; right <= m - 1; right++) {
                            if (nums[i][right] == 1) {
                                score++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(score);
    }
}
