//package codetop;
//
//import sun.net.www.http.ChunkedInputStream;
//
//import java.util.Scanner;
//
//public class Modify {
//
//    public static String styleModify(String s) {
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') {
//                if (s.charAt(i) == '<' || s.charAt(i) == '>' || s.charAt(i) == '=') {
//                    stringBuilder.append(" " + s.charAt(i) + " ");
//                } else {
//                    stringBuilder.append(s.charAt(i));
//                }
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(styleModify("     a    >     b"));
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] nums = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 2; j++) {
//                nums[i][j] = scanner.nextInt();
//            }
//        }
//        int[] result = new int[n];
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            while (nums[i][1] > 0) {
//                int temp = nums[i][0] * (nums[i][1] % 10);
//                sum += temp;
//                nums[i][1] /= 10;
//            }
//            result[i] = sum;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(result[i]);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//        while (true) {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(c).append(d).append(e);
//            if (huiwen(stringBuilder.toString())) {
//                System.out.println(c + " " + d + " " + e);
//                break;
//            }
//            e++;
//            if (e == 3) {
//                e = 1;
//                d++;
//                if (d == 10000) {
//                    d = 1;
//                    c++;
//                }
//            }
//        }
//    }
//
//    public static boolean huiwen(String s) {
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
