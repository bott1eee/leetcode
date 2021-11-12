package stack_queue;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {

        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        dumpStack1();
        return stack2.pop();
    }

    public int peek() {
        dumpStack1();
        return stack2.peek();
    }

    public boolean empty() {
        if (stack1.isEmpty() && stack2.empty())
            return true;
        else
            return false;
    }

    private void dumpStack1() {
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
    }
}
