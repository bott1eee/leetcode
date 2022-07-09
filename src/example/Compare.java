package example;

import java.util.Arrays;

public class Compare {

    public static boolean compare(String one, String two) {

        String[] chars_one = one.split("\\.");
        String[] chars_two = two.split("\\.");
        int firstNum = 0,secondNum = 0;

        for (int i = 0;i< chars_one.length;i++){
            int per = (int) (Integer.valueOf(chars_one[i])*Math.pow(10,2-i));
            firstNum+=per;
        }
        for (int i = 0;i< chars_two.length;i++){
            int per= (int) (Integer.valueOf(chars_two[i])*Math.pow(10,2-i));
            secondNum+=per;
        }

        return firstNum>=secondNum;
    }





    public static void main(String[] args) {
        System.out.println(compare("1.8.3","1.6"));
    }
}
