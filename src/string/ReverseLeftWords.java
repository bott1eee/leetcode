package string;

public class ReverseLeftWords {


    /*
    简单暴力方法
    先将字符串 s 中的 n 后面的字符存入 StringBuffer
    再将字符串 s 中的 n 前面的字符存入 StringBuffer
     */
    public static String reverseLeftWords(String s, int n) {

        char[] s_array = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = n; i < s.length(); i++)
            stringBuffer.append(s_array[i]);

        for (int i = 0; i < n; i++)
            stringBuffer.append(s_array[i]);
        return stringBuffer.toString();
    }

    /*
    多次反转法
    先将字符串 s 中的前 n 个字符反转
    再将字符串 s 中的 n 后的字符反转
    最后将整个字符串 s 反转
    1、a b c e f g h
    2、b a c e f g h
    3、b a h g f e c
    4、c e f g h a b
     */
    public static String reverseLeftWords_2(String s, int n) {

        s=reverseString(s,0,n-1);
        s=reverseString(s,n,s.length()-1);
        s=reverseString(s,0,s.length()-1);
        return s;
    }

    public static  String reverseString(String s, int start, int end){

        char[] s_array = s.toCharArray();
        while (start<end){
            char temp = s_array[start];
            s_array[start]=s_array[end];
            s_array[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(s_array);
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords_2("abcdefg",2));
    }
}
