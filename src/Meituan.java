import java.util.Scanner;

public class Meituan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int positiveNum = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < 0){
                    positiveNum++;
                }
                if (positiveNum%2==0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    
}
