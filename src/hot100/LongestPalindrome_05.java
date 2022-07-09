package hot100;

public class LongestPalindrome_05 {

    public static String longestPalindrome(String s) {

//        String result = "";
//        int max = 0;
//        for (int i = 0;i<s.length();i++){
//            for (int j = i+1;j<s.length();j++){
//                if (isPalindrome(s.substring(i,j))){
//                    if (s.substring(i,j).length()>max){
//                        result = s.substring(i,j);
//                        max = s.substring(i,j).length();
//                    }
//                }
//            }
//        }
//        return result;

        String result = "";
        int length = s.length();
        for (int i = length; i > 0; i--) {
            for (int j = 0; j + i - 1 < length; j++) {
                result = s.substring(j, j + i);
                if (isPalindrome(result)) {
                    return result;
                }
            }
        }

        return s.substring(0, 1);
    }

    public static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("gcbabsh"));
    }
}
