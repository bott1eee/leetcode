package doublePointer;

public class ReplaceSpace {

    public String replaceSpace(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)!=' ')
                stringBuilder.append(s.charAt(i));
            else
                stringBuilder.append("%20");
        }
        return String.valueOf(stringBuilder);
    }
}
