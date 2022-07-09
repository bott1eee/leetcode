package hot100;

import java.util.Stack;

public class IsValid_20 {

    /*
    20-有效的括号
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty())
                    return false;
                Character stack_bracket = stack.pop();
                if (bracket == '}' && stack_bracket != '{')
                    return false;
                if (bracket == ']' && stack_bracket != '[')
                    return false;
                if (bracket == ')' && stack_bracket != '(')
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
            Character bracket = s.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '('){
                stack.push(bracket);
            }else {
                if (stack.isEmpty())
                    return false;
                Character stack_bracket = stack.pop();
                if (bracket == '}' && stack_bracket != '{')
                    return false;
                if (bracket == ']' && stack_bracket != '[')
                    return false;
                if (bracket == ')' && stack_bracket != '(')
                    return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
