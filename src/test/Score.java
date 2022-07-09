package test;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int maxscore = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            int score = 0;
//            for (int j = i; j < str.length() - 1; ) {
//                if (str.charAt(j) == str.charAt(j + 1) || Math.abs(str.charAt(j) - str.charAt(j + 1)) == 1) {
//                    score += str.charAt(j) - 'a' + 1;
//                    score += str.charAt(j + 1) - 'a' + 1;
//                    j += 2;
//                    continue;
//                }
//                j++;
//            }
//            maxscore = Math.max(maxscore, score);
//        }
//        System.out.println(maxscore);
        int pre = 0;
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) || Math.abs(str.charAt(i) - str.charAt(i + 1)) == 1) {
                int score = str.charAt(i) - 'a' + 1;
                score += str.charAt(i + 1) - 'a' + 1;
                pre = pre + score;
                count++;
            } else {
                count--;
            }
            if (count <= 0) {
                maxscore = Math.max(maxscore,pre);
            } else {
                maxscore = Math.abs(maxscore-pre);
            }
        }
        System.out.println(maxscore);
    }
}
