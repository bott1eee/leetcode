package stack_queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class EvalRPN {

    /*
    遍历字符串数组，将字符串中的数字 push 进栈
    若为运算符，则将栈 pop 两次，进行运算
    运算完成后将运算结果 push 进栈
     */
    public static int evalRPN(String[] tokens) {

        int result = 0;
        ArrayDeque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                deque.push(tokens[i]);
            } else {
                int x1 = Integer.parseInt(deque.pop());
                int x2 = Integer.parseInt(deque.pop());
                if (tokens[i].equals("+"))
                    result = x2 + x1;
                else if (tokens[i].equals("-"))
                    result = x2 - x1;
                else if (tokens[i].equals("*"))
                    result = x2 * x1;
                else if (tokens[i].equals("/"))
                    result = x2 / x1;
                deque.push(String.valueOf(result));
            }
        }
        return Integer.parseInt(deque.pop());
    }

    public static void main(String[] args) {
        String[] str = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(str));
    }

    public int evalRPN_2(String[] tokens) {

        Stack<String> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(tokens[i]);
            } else {
                int x1 = Integer.parseInt(stack.pop());
                int x2 = Integer.parseInt(stack.pop());
                if (tokens[i].equals("+"))
                    result = x1 + x2;
                else if (tokens[i].equals("-"))
                    result = x2 - x1;
                else if (tokens[i].equals("*"))
                    result = x2 * x1;
                else if (tokens[i].equals("/"))
                    result = x2 / x1;
                stack.push(String.valueOf(result));
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
