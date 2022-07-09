package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combine {

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> item = new LinkedList<>();
        backtrack(n, k, 1, result, item);
        return result;
    }

    public static void backtrack(int n, int k, int startIndex, List<List<Integer>> result, LinkedList<Integer> item) {

        // 终止条件
        if (item.size() == k) {
            result.add(new ArrayList<>(item));
            return;
        }

        for (int i = startIndex; i <= n - (k - item.size()) + 1; i++) {
            item.add(i);
            backtrack(n, k, i + 1, result, item);
            item.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}
