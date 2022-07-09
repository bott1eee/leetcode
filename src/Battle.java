import java.util.Scanner;

public class Battle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
        int damage1 = 0;
        int baseDamage = 0;
        int damage2 = 0;
        int money = 0;
        for (int i = 0; i < n; i++) {
            baseDamage += nums1[i];
            damage1 = baseDamage + money * (i + 1);
            damage2 += nums2[i];
            if (i == 0) {
                if (nums1[i] <= nums2[i]) {
                    money += nums2[i] - nums1[i] + 1;
                }
            } else {
                if (damage1 <= damage2) {
                    money += (damage2 - damage1) / (i + 1) + 1;
                }
            }
        }
        System.out.println(money);
    }
}
