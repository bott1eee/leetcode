package backtrack;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        String[] num2letter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result, digits, num2letter, 0);
        return result;
    }

    static StringBuilder stringBuilder = new StringBuilder();

    public static void backtrack(List<String> result, String digits, String[] num2letter, int num) {

        if (num == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        String str = num2letter[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            backtrack(result, digits, num2letter, num + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
