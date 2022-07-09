package hot100;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class Convert_Z_06 {

    public static String convert(String s, int numRows) {

        if (numRows == 0) {
            return s;
        }

        StringBuilder[] strings = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            strings[i] = new StringBuilder();
        }
        int remainder = 0;
        for (int i = 0; i < s.length(); i++) {
            remainder = i % (numRows * 2 - 2);
            if (remainder >= numRows) {
                remainder = Math.abs(remainder - (numRows * 2 - 2));
            }
            strings[remainder].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder string : strings) {
            result.append(string);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));

//        StringBuilder[] stringBuilders = new StringBuilder[4];
//        stringBuilders[0].append("bott1eee");
//        System.out.println(stringBuilders[0].toString());


    }
}
