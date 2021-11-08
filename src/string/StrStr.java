package string;

public class StrStr {

    /*
    暴力匹配法
     */
    public static int strStr(String haystack, String needle) {

        if (needle.equals(""))
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int index = 0;
            boolean flag = true;
            for (int j = i; j < i + needle.length(); j++) {
                if (haystack.charAt(j) != needle.charAt(index))
                    flag = false;
                index++;
            }
            if (flag)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","mississippi"));
    }
}
