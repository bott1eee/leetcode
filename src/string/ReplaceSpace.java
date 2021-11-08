package string;

public class ReplaceSpace {

    public String replaceSpace(String s) {

        StringBuffer stringBuffer = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c == ' ')
                stringBuffer.append("%20");
            else
                stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    public String replaceSpace_2(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c==' ')
                stringBuilder.append("%20");
            else
                stringBuilder.append(c);
        }
        return String.valueOf(stringBuilder);
    }
}
