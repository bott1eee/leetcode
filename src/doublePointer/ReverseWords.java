package doublePointer;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(clean_space("   i love   you  ".toCharArray()));
        System.out.println(reverseWords("   i  love    you    "));
    }

    public static String reverseWords(String s) {
        char[] s_array = s.toCharArray();

        return String.valueOf(reverseWord(reverseString(clean_space(s_array),0,clean_space(s_array).length-1)));
    }

    public static char[] clean_space(char[] s_array) {

        StringBuilder stringBuilder = new StringBuilder();

        int start = 0;
        int end = s_array.length - 1;
        while (s_array[start] == ' ')
            start++;
        while (s_array[end] == ' ')
            end--;
        while (start <= end) {
            if (s_array[start] != ' ')
                stringBuilder.append(s_array[start]);
            if (s_array[start] == ' ' && s_array[start - 1] != ' ')
                stringBuilder.append(' ');
            start++;
        }
        return stringBuilder.toString().toCharArray();
    }

    public static char[] reverseString(char[] s_array, int start, int end) {

        while (start < end) {
            char temp = s_array[start];
            s_array[start] = s_array[end];
            s_array[end] = temp;
            start++;
            end--;
        }
        return s_array;
    }

    public static char[] reverseWord(char[] s_array) {

        int start = 0;
        int end = start + 1;

        while (start < s_array.length) {
            while (end < s_array.length && s_array[end] != ' ')
                end++;
            reverseString(s_array, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
        return s_array;
    }
}
