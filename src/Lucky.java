import java.util.Scanner;

public class Lucky {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 11 == 0 || hasTwoOne(nums[i])){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean hasTwoOne(int n) {
        String str = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1'){
                count++;
            }
            if (count>=2){
                return true;
            }
        }
        return false;
    }
}


