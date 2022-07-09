package codetop;

import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else {
                Character character = stack.pop();
                if (s.charAt(i) == '}' && character != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && character != '[') {
                    return false;
                } else if (s.charAt(i) == ')' && character != ')') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public boolean valid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character character = stack.pop();
                if (s.charAt(i) == '}' && character != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && character != '[') {
                    return false;
                } else if (s.charAt(i) == ')' && character != '(') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valid_2(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || s.charAt(i) != stack.peek()){
                return false;
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
