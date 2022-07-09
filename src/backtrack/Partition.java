package backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partition {

    public static List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        LinkedList<String> item = new LinkedList<>();
        backtrack(s, 0, result, item);
        return result;
    }

    public static void backtrack(String s, int startIndex, List<List<String>> result, LinkedList<String> item) {

        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(item));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                item.add(str);
            } else {
                continue;
            }
            backtrack(s, i + 1, result, item);
            item.removeLast();
        }
    }

    public static boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
}
