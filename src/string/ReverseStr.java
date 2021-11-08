package string;

public class ReverseStr {


    /*
    对字符串 s 进行分割成 k段和 2k段
     */
    public static String reverseStr(String s, int k) {

        int start = 0;
        int length = s.length();

        while (start < length) {
            int firstK;
            if (start + k <= length)
                firstK = start + k;
            else
                firstK = length;
            s = reverse(s, start, firstK);
            start += (2 * k);
        }
        return s;
    }

    public static String reverse(String s, int start, int end) {
        char[] str = s.toCharArray();
        end--;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseStr(s, 2));
        System.out.println(reverseStringSpecify("abcdefg", 1, 2));

        System.out.println(reverseStr_3("abcdefghijklmn", 2));
        System.out.println(reverseStr_4("abcdefghijklmn", 2));

    }

    public String reverseStr_2(String s, int k) {

        StringBuffer res = new StringBuffer();
        int start = 0;
        int length = s.length();

        while (start < length) {
            int firstK, secondK;
            StringBuilder temp = new StringBuilder();
            if (start + k < length)
                firstK = start + k;
            else
                firstK = length;
            if (start + (2 * k) < length)
                secondK = start + 2 * k;
            else
                secondK = length;
            temp.append(s.substring(start, firstK));
            res.append(temp.reverse());
            if (firstK < secondK)
                res.append(s.substring(firstK, secondK));
            start += 2 * k;
        }
        return res.toString();
    }

    public static String reverseStr_3(String s, int k) {

        int start = 0;
        int end = s.length();
        while (start < end) {
            int firstK = 0;
            if (start + k < end)
                firstK = start + k;
            else
                firstK = end;
            s = reverseStringSpecify(s, start, firstK);
            start += 2 * k;
        }
        return s;
    }

    public static String reverseStr_4(String s, int k) {

        int start = 0;
        int end = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (start<end){
            int firstK = 0;
            int secondK = 0;
            if (start+k<end)
                firstK = start+k;
            else
                firstK = end;
            if (start+2*k<end)
                secondK = start+2*k;
            else
                secondK=end;
            stringBuilder.append(reverseStringSpecify(s.substring(start,firstK),0,s.substring(start,firstK).length()));
            if (firstK<secondK)
                stringBuilder.append(s.substring(firstK,secondK));
            start+=2*k;
        }
        return String.valueOf(stringBuilder);
    }

    public static String reverseStringSpecify(String s, int start, int end) {

        char[] s_array = s.toCharArray();
        end--;
        while (start <= end) {
            char temp = s_array[start];
            s_array[start] = s_array[end];
            s_array[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(s_array);
    }
}
