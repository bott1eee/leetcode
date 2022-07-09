package codetop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] < intervals[j][0]) {
                    if (intervals[i][1] >= intervals[j][0]) {
                        intervals[i][0] = Math.min(intervals[i][0], intervals[j][0]);
                        intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                        intervals[j][0] = intervals[i][0];
                        intervals[j][1] = intervals[i][1];
                    }
                } else {
                    if (intervals[i][0] <= intervals[j][1]) {
                        intervals[i][0] = Math.min(intervals[i][0], intervals[j][0]);
                        intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                        intervals[j][0] = intervals[i][0];
                        intervals[j][1] = intervals[i][1];
                    }
                }
            }
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            List<Integer> item = Arrays.stream(intervals[i]).boxed().collect(Collectors.toList());
            if (!lists.contains(item)) {
                lists.add(item);
            }
        }
        int[][] result = new int[lists.size()][2];
        for (int i = 0; i < lists.size(); i++) {
            result[i][0] = lists.get(i).get(0);
            result[i][1] = lists.get(i).get(1);
        }
        return result;
    }

    public int[][] merge_2(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (list.size() == 0 || list.get(list.size() - 1)[1] < right) {
                list.add(new int[]{left,right});
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], right);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
