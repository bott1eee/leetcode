package biTree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

    /*
    226-翻转二叉树
    层序遍历该二叉树
    遍历到每个节点时，交换该节点的左右孩子节点
     */
    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return root;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
        }
        return root;
    }
}
