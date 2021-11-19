package biTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {

    /*
    104-二叉树的最大深度
     */
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        int maxDeep = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                length--;
            }
            maxDeep++;
        }
        return maxDeep;
    }
}
