import java.util.*;

public class Huawei {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] artical = new String[m * 2 + 1];
        for (int i = 0; i < artical.length; i++) {
            artical[i] = scanner.nextLine();
        }
        LinkedList<String> queue = new LinkedList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < artical.length; i++) {
            String[] word = artical[i].split(" ");
            for (int j = 0; j < word.length; j++) {
                if (i % 2 == 1) {
                    if (!map.containsKey(word[j])) {
                        queue.addLast(word[j]);
                    }
                    map.put(word[j], map.getOrDefault(word[j], 0) + 3);
                } else {
                    if (!map.containsKey(word[j])){
                        queue.addLast(word[j]);
                    }
                    map.put(word[j], map.getOrDefault(word[j], 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())){
                    if (queue.indexOf(o2.getKey()) > queue.indexOf(o1.getKey())){
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println(list.toString());
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(list.get(i).getKey());
            } else {
                System.out.print(list.get(i).getKey() + " ");
            }
        }
    }

    public static void func(int n, int m, String[] artical) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < m * 2; i++) {
            String[] word = artical[i].split(" ");
            for (int j = 0; j < word.length; j++) {
                if (i % 2 == 0) {
                    map.put(word[j], map.getOrDefault(word[j], 0) + 3);
                } else {
                    map.put(word[j], map.getOrDefault(word[j], 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.add((Map.Entry<String, Integer>) map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println(list.toString());
    }


}
