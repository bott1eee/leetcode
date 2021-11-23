package biTree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.PrimitiveIterator;
import java.util.Queue;

public class IsSymmetric {


    /*
    101-对称二叉树
    迭代法
    使用队列
    第一次入队时，将根节点的左节点右节点入队
    判断是否对称
    后面每次入队时，依次将左节点的左孩子、右节点的右孩子、左节点的右孩子、右节点的左孩子入队列
    每次出队时都一次出两个元素节点，然后这两个节点就是要进行比较对称的节点
     */
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode leftTree = queue.poll();
            TreeNode rightTree = queue.poll();
            if (leftTree == null && rightTree == null)
                continue;
            if (leftTree == null || rightTree == null || leftTree.val != rightTree.val)
                return false;
            queue.offer(leftTree.left);
            queue.offer(rightTree.right);
            queue.offer(leftTree.right);
            queue.offer(rightTree.left);
        }
        return true;
    }

    public boolean isSymmetric_2(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode leftTree = queue.poll();
            TreeNode rightTree = queue.poll();
            if (leftTree == null && rightTree == null)
                continue;
            if (leftTree == null || rightTree == null || leftTree.val != rightTree.val)
                return false;
            queue.offer(leftTree.left);
            queue.offer(rightTree.right);
            queue.offer(leftTree.right);
            queue.offer(rightTree.left);
        }
        return true;
    }

    /*
    递归法
     */
    public boolean isSymmetric_4(TreeNode root) {
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null || left.val == right.val)
            return false;
        return compare(left.left, right.right) && compare(left.right, right.left);
    }


    public boolean isSymmetric_5(TreeNode root) {

        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null)
                continue;
            if (left == null || right == null || left.val != right.val)
                return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

    public boolean isSymmetric_6(TreeNode root) {
        if (root == null)
            return true;
        return compare_2(root.left, root.right);
    }

    public boolean compare_2(TreeNode left,TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null || left.val != right.val)
            return false;
        return compare_2(left.left,right.right) && compare_2(left.right,right.left);
    }
}
