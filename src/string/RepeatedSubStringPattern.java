package string;

public class RepeatedSubStringPattern {


    /*
    枚举法
    如果一个长度为n的字符串s可以由长度为n‘的字串s’重复构成，则：
    n一定是n‘的倍数
    s’一定是s的前缀
    对于任意的i，一定有s[i]=s[i-n']
     */
    public static boolean repeatedSubStringPattern(String s) {

        for (int i = 1; 2 * i <= s.length(); i++) {
            if (s.length() % i == 0) {
                boolean flag = true;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (repeatedSubStringPattern("abababab"))
            System.out.println("s1mple");
    }

    public boolean repeatedSubStringPattern_2(String s) {

        for (int i = 1; i * 2 <= s.length(); i++) {
            if (s.length() % i == 0) {
                boolean flag = true;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return true;
            }
        }
        return false;
    }

    public boolean repeatedSubStringPattern_3(String s) {

        for (int i = 1; i * 2 <= s.length(); i++) {
            if (s.length() % i == 0) {
                boolean flag = true;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return true;
            }
        }
        return false;
    }
}
