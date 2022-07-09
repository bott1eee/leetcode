package codetop;

public class AddStrings {

    public String addStrings(String num1, String num2) {

        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int n1, n2;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            } else {
                n1 = 0;
            }
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            } else {
                n2 = 0;
            }
            int temp = n1 + n2 + carry;
            carry = temp / 10;
            stringBuilder.append(temp % 10);
            i--;
            j--;
        }
        if (carry == 1)
            stringBuilder.append(1);
        return stringBuilder.reverse().toString();
    }

    public String addString_2(String num1, String num2) {

        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int n1, n2;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            } else {
                n1 = 0;
            }
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            } else {
                n2 = 0;
            }
            int temp = n1 + n2 + carry;
            carry = temp / 10;
            stringBuilder.append(temp % 10);
            n1--;
            n2--;
        }
        if (carry == 1){
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}
