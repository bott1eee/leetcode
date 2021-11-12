package stack_queue;

import java.util.ArrayDeque;

public class EvalRPN {

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
}
