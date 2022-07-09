import java.util.Scanner;

public class Diancai {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][0] > nums[i][1]) {
                int temp = nums[i][0];
                nums[i][0] = nums[i][1];
                nums[i][1] = temp;
            }
        }
        int result = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][0] > nums[index][1]) {
                result++;
                index = i;
            }
        }
        System.out.println(result);
    }
}
