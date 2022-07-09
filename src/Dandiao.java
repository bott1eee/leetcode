import java.util.*;

public class Dandiao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        HashSet<List<Integer>> result = new HashSet<>();
        List<Integer> item = new LinkedList<>();
        backtrack(nums, 0, result, item);
        System.out.println(result.size() + nums.length);
    }

    public static void backtrack(int[] nums, int startIndex, HashSet<List<Integer>> set, List<Integer> item) {

        if (item.size() >= 2) {
            set.add(new ArrayList<>(item));
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (item.size() == 0 || nums[i] >= item.get(item.size() - 1)) {
                item.add(nums[i]);
                backtrack(nums, i + 1, set, item);
                item.remove(item.size() - 1);
            }
        }
    }
}
