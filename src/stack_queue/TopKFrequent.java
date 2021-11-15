package stack_queue;

import com.sun.javafx.collections.MappingChange;

import java.sql.PreparedStatement;
import java.util.*;

public class TopKFrequent {

    /*
    使用堆-优先队列方法解决问题
    首先遍历数组，将每个数以及出现的次数存入哈希map中，数字作为 key，次数作为 value
    创建一个优先队列，并实现其 Comparator 接口
    遍历 map，将其中的 entry 依次入队列，若队列长度超过 k，则出队列
    再使用循环将队列依次 poll，将其中 entry 的key存入结果数组
     */
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());

        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            //注意若队列长度超过 k，需要 poll
            if (queue.size() > k)
                queue.poll();
        }

        for (int i = k - 1; i >= 0; i--)
            result[i] = queue.poll().getKey();
        return result;
    }

    /*
    暴力法解决
    首先遍历数组，将每个数以及出现的次数存入哈希map中，数字作为 key，次数作为 value
    然后依次将 map 的value（次数）存入一个数组中，并降序排序
    遍历数组的前 k 个元素，根据数组元素对应 map 的 value，并取出对应的 key
    将 key 存入结果数组
     */
    public static int[] topKFrequent_2(int[] nums, int k) {

        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Integer[] count = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count[i] = list.get(i);
        }
        Arrays.sort(count, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (count[i].equals(entry.getValue())) {
                    result[i] = entry.getKey();
                    //注意每存入一个数，就要将 map 中对应的 entry删除，否则若是某两个数出现次数相同，会出现结果数组重复的情况
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent_2(new int[]{1, 2}, 2)));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] nums = new Integer[list.size()];
        nums = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
    }

    public int[] topKFrequent_3(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }

    public int[] topKFrequent_4(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(new int[]{entry.getKey(), entry.getValue()});
            if (queue.size() > k)
                queue.poll();
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[0];
        }
        return result;
    }

    public int[] topKFrequent_5(int[] nums, int k) {

        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k)
                queue.poll();
        }

        for (int i = 0; i < k; i++)
            result[i] = queue.poll().getKey();

        return result;
    }
}
