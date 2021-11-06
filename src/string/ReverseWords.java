package string;

import java.util.stream.Stream;

public class ReverseWords {

    public static String reverseWords(String s) {

        //取出字符串中的多余空格
        int start = 0;
        int end = s.length() - 1;
        while (s.toCharArray()[start] == ' ')
            start++;
        while (s.toCharArray()[end] == ' ')
            end--;
        StringBuffer stringBuffer = new StringBuffer();
        while (start <= end) {
            if (s.toCharArray()[start] != ' ' || s.toCharArray()[start - 1] != ' ')
                stringBuffer.append(s.toCharArray()[start]);
            start++;
        }
        s = stringBuffer.toString();

        //反转整个字符串'
        char[] s_char = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = s_char[i];
            s_char[i] = s_char[s.length() - 1 - i];
            s_char[s.length() - 1 - i] = temp;
        }

        int head = 0;
        int tail = head + 1;
        while (head < s_char.length) {
            while (tail < s_char.length && s_char[tail] != ' ')
                tail++;
            for (int i = head, j = tail - 1; i <= j; ) {
                char temp = s_char[i];
                s_char[i] = s_char[j];
                s_char[j] = temp;
                i++;
                j--;
            }
            head = tail + 1;
            tail += 2;
        }

        return String.valueOf(s_char);
    }

    public static void main(String[] args) {
//        System.out.println(reverseWords("   i love   you   "));
//        System.out.println(clean_space("   i love  you   ".toCharArray()));
//        System.out.println(reverseString(clean_space("   i love  you   ".toCharArray())));
//        System.out.println(reverseWords(reverseString(clean_space("   i love  you   ".toCharArray()))));
//        System.out.println(reverseWords("i love you".toCharArray()));
        System.out.println(reverseWords_2("the sky is blue"));
    }

    /*
    去除字符串中多余的空格
    首先去除字符串中首尾的多余空格
    方式是从头从尾检查字符串首尾的空格，将后面遍历要使用的首尾指针移至非空格处
    然后遍历字符串，忽略多余的空格，将剩余的字符添加至 StringBuffer 中
     */
    public static char[] clean_space(char[] s_array) {
        StringBuffer stringBuffer = new StringBuffer();
        int start = 0;
        int end = s_array.length - 1;
        while (s_array[start] == ' ')
            start++;
        while (s_array[end] == ' ')
            end--;
        while (start <= end) {
            if (s_array[start] != ' ')
                stringBuffer.append(s_array[start]);
            if (s_array[start] == ' ' && s_array[start - 1] != ' ')
                stringBuffer.append(' ');
            start++;
        }
        return stringBuffer.toString().toCharArray();
    }

    /*
    反转整个字符串
     */
    public static char[] reverseString(char[] s_array) {
        for (int i = 0; i < s_array.length / 2; i++) {
            char temp = s_array[i];
            s_array[i] = s_array[s_array.length - 1 - i];
            s_array[s_array.length - 1 - i] = temp;
        }
        return s_array;
    }

    /*
    反转字符串中的每个单词
    首先遍历字符串找出每个单词的首尾，并使用 start 和 end 进行标记，
    然后使用临时变量 i、j对每个单词进行反转
     */
    public static char[] reverseWords(char[] s_array) {

        int start = 0;
        int end = start + 1;

        while (start < s_array.length) {
            while (end < s_array.length && s_array[end] != ' ')
                end++;
            for (int i = start, j = end - 1; i <= j; ) {
                char temp = s_array[i];
                s_array[i] = s_array[j];
                s_array[j] = temp;
                i++;
                j--;
            }
            start = end + 1;
            end = start + 1;
        }
        return s_array;
    }

    public static String reverseWords_2(String s){
        char[] s_array = reverseWords(reverseString(clean_space(s.toCharArray())));
        return String.valueOf(s_array);
    }
}
