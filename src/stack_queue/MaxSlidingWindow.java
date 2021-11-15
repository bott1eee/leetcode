package stack_queue;

import java.util.*;

public class MaxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 1)
            return nums;

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }
        list.add(maxInQueue(queue));
        for (int i = k; i < nums.length; i++) {
            queue.poll();
            queue.offer(nums[i]);
            list.add(maxInQueue(queue));
        }
        int[] result = new int[list.size()];
        for (int i = 0;i<list.size();i++)
            result[i] = list.get(i);

        return result;
    }

    public static int maxInQueue(Queue<Integer> queue) {

        Queue<Integer> temp = new ArrayDeque<>();
        while (!queue.isEmpty())
            temp.offer(queue.poll());
        int max = temp.peek();
        while (!temp.isEmpty()) {
            int i = temp.poll();
            if (i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));
    }
}
