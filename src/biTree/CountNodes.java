package biTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {

    /*
    222-完全二叉树的节点个数
    迭代法
    层序遍历二叉树，对遍历的节点进行计数
     */
    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                count++;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
        }
        return count;
    }

    /*
    递归法
    所有二叉树的通用解法
     */
    public int countNodes_2(TreeNode root) {
        if (root == null)
            return 0;

        return countNodes_2(root.left) + countNodes_2(root.right) + 1;
    }

    /*
    递归法
    完全二叉树的特殊解法
    完全二叉树分为两种情况
    情况一：满二叉树
        可以直接用 2^树深度-1 来计算
    情况二：最后一层叶子节点没有满
        分别递归左孩子和右孩子，递归到某一深度一定会有左孩子或者右孩子为满二叉树，然后按照情况1计算
     */
    public int countNodes_3(TreeNode root) {

        if (root == null)
            return 0;

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if (leftDepth == rightDepth) {
            //左子树是满二叉树
            //2^leftDepth 其实就是 (2^leftDepth-1)+1，左子树+根节点
            return (1 << leftDepth) + countNodes_3(root.right);
        } else {
            //右子树是满二叉树
            return (1 << rightDepth) + countNodes_3(root.left);
        }
    }

    public int getDepth(TreeNode root) {
        int depth = 0;
        while (root != null) {
            depth++;
            root = root.left;
        }
        return depth;
    }
}
