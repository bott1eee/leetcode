package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> item = new LinkedList<>();
        backtrack(candidates, target, 0, 0, result, item);
        return result;
    }

    public static void backtrack(int[] candidates, int target, int startIndex, int sum, List<List<Integer>> result, LinkedList<Integer> item) {

        if (sum == target) {
            result.add(new ArrayList<>(item));
            return;
        } else if (sum > target) {
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            sum += candidates[i];
            item.add(candidates[i]);
            backtrack(candidates, target, i, sum, result, item);
            sum -= candidates[i];
            item.removeLast();
        }
    }


    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
