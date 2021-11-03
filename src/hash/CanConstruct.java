package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CanConstruct {


    /*
    定义一个hashmap用于存放magazine中的各字母的次数，
    然后遍历ransomNote数组，检验是否在map中有相同字母
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0)
                return false;
            else
                map.put(c, --count);
        }
        return true;
    }

    /*
    与上述方法类似，只是将hashmap替换为数组形式
     */
    public boolean canConstruct_2(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0)
                return false;
            else
                count[c - 'a']--;
        }
        return true;
    }
}
