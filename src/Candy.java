import java.util.Arrays;
import java.util.Scanner;

public class Candy {

    public static void main(String[] args) {

        int n, k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] candy = new int[n];
        for (int i = 0; i < n; i++) {
            candy[i] = scanner.nextInt();
        }
        Arrays.sort(candy);
        int count = 0;
        int sweet = 0;
        for (int i = 0; i < candy.length; i++) {
            sweet += candy[i];
            count++;
            if (sweet > k) {
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}
