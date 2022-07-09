package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> item = new LinkedList<>();
        boolean[] flag = new boolean[candidates.length];
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, result, item, flag);
        return result;
    }

    public static void backtrack(int[] candidates, int target, int startIndex, int sum, List<List<Integer>> result, LinkedList<Integer> item, boolean[] flag) {

        if (sum == target) {
            result.add(new ArrayList<>(item));
            return;
        } else if (sum > target) {
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && !flag[i - 1]) {
                continue;
            }

            sum += candidates[i];
            flag[i] = true;
            item.add(candidates[i]);
            backtrack(candidates, target, i + 1, sum, result, item, flag);
            sum -= candidates[i];
            flag[i] = false;
            item.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}
