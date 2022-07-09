import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Huawei_2 {

    static ArrayList<Integer> list = new ArrayList<>();
    public static int[] array = new int[5010];
    static ArrayList<Integer>[] list_arr = new ArrayList[5010];
    static boolean flag = true;

    static public void backtrack(int k) {
        if (!flag) {
            return;
        }
        int length = list_arr[k].size();
        for (int i = 0; i < length; i++) {
            int temp = list_arr[k].get(i);
            if (array[temp] == 1) {
                flag = false;
                return;
            } else {
                list.add(temp);
                array[temp] = 1;
                backtrack(temp);
                array[temp] = 0;
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            list_arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            String[] str_list = str.split(",");
            int count = Integer.valueOf(str_list[0]);
            for (int j = 1; j <= count; j++) {
                int x = Integer.valueOf(str_list[j]);
                list_arr[i].add(x);
            }
        }
        if (list_arr[m].size() == 0) {
            System.out.println("null");
        } else {
            array[m] = 1;
            backtrack(m);
            if (!flag) {
                System.out.println("-1");
            } else {
                Collections.sort(list);
                ArrayList<Integer> list_temp = new ArrayList<>();
                int length = list.size();
                for (int i = 0; i < length; i++) {
                    if (i == 0) {
                        list_temp.add(list.get(i));
                    } else {
                        if (list.get(i) == list.get(i - 1)) ;
                        else list_temp.add(list.get(i));
                    }
                }
                length = list_temp.size();
                Collections.sort(list_temp);
                for (int i = 0; i < length - 1; i++) {
                    System.out.println(list_temp.get(i) + ",");
                }
                System.out.println(list.get(length - 1));
            }
        }
    }
}
