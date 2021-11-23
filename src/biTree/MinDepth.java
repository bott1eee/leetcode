package biTree;

import sun.rmi.runtime.RuntimeUtil;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

    /*
    111-二叉树的最小深度
    要求最小深度，即当找到第一个叶子节点时二叉树的深度
    判断叶子节点的方式是它的左孩子和右孩子都为空
    当找到叶子节点时，退出当前循环，并将队列清空
     */
    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        int mindeep = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    queue.clear();
                    break;
                }
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
            mindeep++;
        }
        return mindeep;
    }

    public int minDepth_2(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        int depth = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    queue.clear();
                    break;
                }
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
            depth++;
        }
        return depth;
    }

    /*
    递归法
    如果左子树为空，右子树不为空，说明最小深度是 1+右子树的深度
    反之如果右子树为空，左子树不为空，最小深度是 1+左子树的深度
    如果左右子树都不为空，返回左右子树深度最小值 +1
     */
    public int minDepth_3(TreeNode root) {

        if (root == null)
            return 0;

        int left = minDepth_3(root.left);
        int right = minDepth_3(root.right);
        if (root.left == null)
            return right + 1;
        if (root.right == null)
            return left + 1;
        return Math.min(left, right) + 1;
    }
}
