package backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> item = new LinkedList<>();
        backtrack(k, n, 1, result, item);
        return result;
    }

    public static void backtrack(int k, int n, int startIndex, List<List<Integer>> result, LinkedList<Integer> item) {

        if (item.size() == k) {
            int sum = 0;
            for (int x : item) {
                sum += x;
            }
            if (sum == n) {
                result.add(new ArrayList<>(item));
            }
            return;
        }

        for (int i = startIndex; i <= 9 - (k - item.size()) + 1; i++) {
            item.add(i);
            backtrack(k, n, i + 1, result, item);
            item.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,9));
    }
}
