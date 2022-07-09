package codetop;

import biTree.TreeNode;

import java.util.*;

public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int length = queue.size();
            Deque<Integer> deque = new LinkedList<>();

            while (length > 0) {
                TreeNode node = queue.poll();
                if (flag){
                    deque.offerLast(node.val);
                } else {
                    deque.offerFirst(node.val);
                }
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                length--;
            }
            result.add(new LinkedList<Integer>(deque));
            flag = !flag;
        }
        return result;
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        System.out.println(deque.pollFirst());
    }
}
