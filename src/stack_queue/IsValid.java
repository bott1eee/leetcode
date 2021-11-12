package stack_queue;

import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.isEmpty())
                    return false;
                Character scope = stack.pop();
                if (s.charAt(i) == ')')
                    if (scope != '(')
                        return false;
                if (s.charAt(i) == ']')
                    if (scope != '[')
                        return false;
                if (s.charAt(i) == '}')
                    if (scope != '{')
                        return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public boolean isValid_2(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== '(')
                stack.push(')');
            else if (s.charAt(i) == '[')
                stack.push(']');
            else if (s.charAt(i) == '{')
                stack.push('}');
            else if (stack.isEmpty() || s.charAt(i)!=stack.peek())
                return false;
            else
                stack.pop();
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public boolean isValid_3(String s) {

        for (int i = 0;i<s.length();i++){
            s = s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.length()==0;
    }
}
