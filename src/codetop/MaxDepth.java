package codetop;

import biTree.TreeNode;

import java.util.*;

public class MaxDepth {

    public int maxDepth(TreeNode root) {

//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null)
//            return 0;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//
//            int length = queue.size();
//            List<Integer> list = new ArrayList<>();
//            while (length > 0) {
//                TreeNode node = queue.poll();
//                list.add(node.val);
//                if (node.left != null)
//                    queue.offer(node.left);
//                if (node.right != null)
//                    queue.offer(node.right);
//                length--;
//            }
//            result.add(list);
//        }

        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0;
        while (!queue.isEmpty()) {
            size++;
            int length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
        }
        return size;
    }

    public int maxdepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxdepth(root.left);
        int right = maxdepth(root.right);
        return Math.max(left, right) + 1;
    }
}
