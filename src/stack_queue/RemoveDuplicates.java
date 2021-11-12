package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemoveDuplicates {


    //使用堆栈解决问题
    public static String removeDuplicates(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c:s.toCharArray()){
            if (stack.isEmpty() || stack.peek()!=c){
                stack.push(c);
            }else {
                stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
