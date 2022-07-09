package hot100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubString {

    public static int lengthOfLongestSubString(String s) {

        char[] array = s.toCharArray();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else {
                    break;
                }
            }
            if (set.size() > length)
                length = set.size();
        }
        return length;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubString(" "));
//        System.out.println(length("abcabcbb"));
        System.out.println(lengthOfLongestSubString_2("abba"));
    }


    public static int length(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static int lengthOfLongestSubString_2(String s) {
        if (s.length() == 0)
            return 0;
        int max = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public int length_2(String s) {
        int length = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < array.length; j++) {
                if (!set.contains(array[j])) {
                    set.add(array[i]);
                } else {
                    break;
                }
            }
            if (set.size() > length) {
                length = set.size();
            }
        }
        return length;
    }

    public int length_3(String s) {

        if (s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            length = Math.max(length, i - left + 1);
        }
        return length;
    }

    public int length_4(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else {
                    break;
                }
            }
            length = Math.max(length, set.size());
        }
        return length;
    }

    public int length_5(String s) {
        if (s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            length = Math.max(length, i - left + 1);
        }
        return length;
    }


}
