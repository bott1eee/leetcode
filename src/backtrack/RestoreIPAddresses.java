package backtrack;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

    public static List<String> restoreIpAddress(String s) {

        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, result);
        return result;
    }

    public static void backtrack(String s, int startIndex, int pointNum, List<String> result) {

        if (pointNum == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                result.add(s);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                backtrack(s, i + 2, pointNum, result);
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                System.out.println(1);
                break;
            }
        }
    }

    public static boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddress_2("25525511135"));
    }

    public static List<String> restoreIpAddress_2(String s) {

        List<String> result = new ArrayList<>();
        backtrack_2(s, 0, 0, result);
        return result;
    }

    public static void backtrack_2(String s, int startIndex, int pointNum, List<String> result) {
        if (pointNum == 3) {
            if (isValid_2(s, startIndex, s.length() - 1)) {
                result.add(s);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid_2(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                backtrack(s, i + 2, pointNum, result);
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }
        }
    }

    public static boolean isValid_2(String s, int start, int end) {

        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
