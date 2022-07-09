import java.util.ArrayList;
import java.util.List;

public class JustifyFull {

    public static ArrayList<String> justifyFull(String[] words, int M) {

        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(M << 1);
        int count = 0;
        int length = 0;
        int left = -1;
        int right = 0;
        while (right < words.length) {
            length += words[right].length();
            count++;
            if (length == M) {
                for (int i = left + 1; i <= right; i++) {
                    sb.append(words[i]).append(' ');
                }
                sb.deleteCharAt(sb.length() - 1);
                list.add(sb.toString());
                left = right;
                sb.delete(0, sb.length());
                length = 0;
                count = 0;
            } else if (length + 1 == M) {
                sb.append(words[left + 1]).append("  ");
                for (int i = left + 2; i <= right; i++) {
                    sb.append(words[i]).append(' ');
                }
                sb.deleteCharAt(sb.length() - 1);
                list.add(sb.toString());
                left = right;
                sb.delete(0, sb.length());
                length = 0;
                count = 0;
            } else if (length > M) {
                length -= words[right].length();
                count--;
                right--;
                if (count == 1) {
                    sb.append(words[right]);
                    for (int i = M - words[right].length(); i > 0; i--) {
                        sb.append(' ');
                    }
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                    left = right;
                } else {
                    int temp_count = count - 1;
                    int temp_length = 0;
                    for (int i = left + 1; i <= right; i++) {
                        temp_length += words[i].length();
                    }
                    int final_length = M - temp_length;
                    int average = final_length / temp_count;
                    int k = final_length % temp_count;
                    int temp = 0;
                    for (int i = left + 1; i <= right; i++) {
                        sb.append(words[i]);
                        for (int j = 0; j < average; j++) {
                            sb.append(' ');
                        }
                        if (temp < k) {
                            sb.append(' ');
                        }
                        temp++;
                    }
                    list.add(sb.substring(0, M));
                    sb.delete(0, sb.length());
                    left = right;
                }
                length = 0;
                count = 0;
            } else {
                length++;
            }
            right++;
        }
        if (left < words.length - 1) {
            for (int i = left + 1; i < words.length; i++) {
                sb.append(words[i]).append(' ');
            }
            for (int i = M - sb.length(); i > 0; i--) {
                sb.append(' ');
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {
//        System.out.println(justifyFull(new String[7]{"This","is","an","instance","of","code","alignment"}),16);
        String[] strs = new String[7];
        strs[0] = "This";
        strs[1] = "is";
        strs[2] = "an";
        strs[3] = "instance";
        strs[4] = "of";
        strs[5] = "code";
        strs[6] = "alignment";
        System.out.println(justifyFull(strs, 16));
    }
}
