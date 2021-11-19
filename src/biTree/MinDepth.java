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
                if (node.left == null && node.right == null){
                    queue.clear();
                    break;
                }
                if (node.left!= null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                length--;
            }
            mindeep++;
        }
        return mindeep;
    }
}
