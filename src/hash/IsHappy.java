package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsHappy {

    /*
    每次求出平方后的sum的值，并将其存入Set中，
    若Set中已有此值，表明sum开始无限循环，永远不可能=1是快乐数，此时返回false。
     */
    public boolean isHappy(int n) {

        String s = String.valueOf(n);
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c)) * Integer.parseInt(String.valueOf(c));
            }
            if (sum == 1)
                return true;
            else {
                if (set.contains(sum))
                    return false;
                set.add(sum);
                s = String.valueOf(sum);
            }
        }
    }

    public static void main(String[] args) {

    }

    public boolean isHappy_2(int n) {

        Set<Integer> set = new HashSet<>();
        String s = String.valueOf(n);
        while (true) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c)) * Integer.parseInt(String.valueOf(c));
            }
            if (sum == 1)
                return true;
            else {
                if (set.contains(sum))
                    return false;
                set.add(sum);
                s = String.valueOf(sum);
            }
        }
    }

    public boolean isHappy_3(int n) {

        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int divide_temp = n % 10;
                sum += divide_temp * divide_temp;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public boolean ishappy(int n) {

        String s = String.valueOf(n);
        Set<Integer> set = new HashSet<>();
        while (true) {
//            int sum = 0;
//            for (char c : s.toCharArray()) {
//                sum += Integer.parseInt(String.valueOf(c)) * Integer.parseInt(String.valueOf(c));
//            }
            int sum = 0;
            while (n > 0) {
                int single = n % 10;
                sum += single * single;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else {
                if (set.contains(sum)) {
                    return false;
                } else {
                    set.add(sum);
                    n = sum;
                }
            }
        }
    }

    public boolean ishappy_2(int n) {

        Set<Integer> set = new HashSet<>();

        while (true) {
            int sum = 0;
            while (n > 0) {
                int single = n % 10;
                sum += single * single;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else {
                if (set.contains(sum)) {
                    return false;
                } else {
                    set.add(sum);
                    n = sum;
                }
            }
        }
    }
}
