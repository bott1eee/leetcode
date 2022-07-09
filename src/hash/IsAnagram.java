package hash;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {

        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a']--;
        }
        for (int i : record) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public static boolean isAnagram_map(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map_s = new HashMap<Character, Integer>();
        Map<Character, Integer> map_t = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
            map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map_s.entrySet()) {
            if (entry.getValue() != map_t.getOrDefault(entry.getKey(), 0))
                return false;
//            int ns = entry.getValue();
//            int nt = map_t.getOrDefault(entry.getKey(),0);
//            if(ns!=nt) {
//                return false;
//        }
        }
        return true;
    }

    public static void main(String[] args) {
        if (isAnagram_map("abcc", "ccab"))
            System.out.println("1111");
    }

    public boolean isAnagram_2(String s, String t) {

        int[] count = new int[26];
        for (char char_s : s.toCharArray())
            count[char_s - 'a']++;
        for (char char_t : t.toCharArray())
            count[char_t - 'a']--;
        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public boolean isanagram(String s, String t) {

        int[] char_count = new int[26];
        for (char c_s : s.toCharArray()) {
            char_count[c_s - 'a']++;
        }
        for (char c_t : t.toCharArray()) {
            char_count[c_t - 'a']--;
        }
        for (int i = 0; i < char_count.length; i++) {
            if (char_count[i] != 0)
                return false;
        }
        return true;
    }

    public boolean isana(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map_s.put(s.charAt(i),map_s.getOrDefault(s.charAt(i),0));
            map_t.put(t.charAt(i),map_t.getOrDefault(t.charAt(i),0));
        }

        for (Map.Entry<Character, Integer> entry : map_s.entrySet()) {
            if (entry.getValue() != map_t.getOrDefault(entry.getKey(),0)){
                return false;
            }
        }
        return true;
    }
}
