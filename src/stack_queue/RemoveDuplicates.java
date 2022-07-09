package stack_queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class RemoveDuplicates {


    //使用堆栈解决问题
    public static String removeDuplicates(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            //注意此处，还需判断栈是否为空，若栈此时为空，也应该入栈
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));

        int[] nums = {1,2,3,5,7};
        String str = Arrays.toString(nums);
        System.out.println(str);
    }

    public static String removeDuplicates_2(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() || stack.peek() != c)
                stack.push(c);
            else
                stack.pop();
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}