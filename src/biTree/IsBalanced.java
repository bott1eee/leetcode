package biTree;

import java.util.LinkedList;
import java.util.Queue;

public class IsBalanced {

    /*
    110-平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.offer(root);
        int length = 0;
        int minDepth = 0;
        int maxDepth = 0;
        while (!queue1.isEmpty()) {
            length = queue1.size();
            while (length > 0) {
                TreeNode node = queue1.poll();
                if (node.left == null && node.right == null) {
                    queue1.clear();
                    break;
                }
                if (node.left != null)
                    queue1.offer(node.left);
                if (node.right != null)
                    queue1.offer(node.right);
                length--;
            }
            minDepth++;
        }
        queue1.offer(root);
        while (!queue1.isEmpty()) {
            length = queue1.size();
            while (length > 0) {
                TreeNode node = queue1.poll();
                if (node.left != null)
                    queue1.offer(node.left);
                if (node.right != null)
                    queue1.offer(node.right);
                length--;
            }
            maxDepth++;
        }

        return maxDepth - minDepth <= 1;
    }


    /*
    递归法
    分别求出左右两个子树的高度，然后如果差值小于等于1，则返回当前二叉树的高度，否则返回-1，表示已经不是二叉平衡树了，-1这个值会一直传递直至结束
     */
    public boolean isBalanced_2(TreeNode root) {
        if (getHeight(root) == -1)
            return false;
        else
            return true;
    }

    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1)
            return -1;
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        else
            return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalenced_3(TreeNode root) {
        return getHeight_2(root) != -1;
    }

    public int getHeight_2(TreeNode root) {
        int leftHeight = getHeight_2(root.left);
        if (leftHeight == -1)
            return -1;
        int rightHeight = getHeight_2(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        else
            return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isbalance(TreeNode root) {

        if (digui(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public int digui(TreeNode root) {
        if (root == null)
            return 0;
        int left = digui(root.left);
        if (left == -1) {
            return -1;
        }
        int right = digui(root.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1)
            return -1;
        else
            return Math.max(left, right) + 1;
    }

    public int digui_2(TreeNode root) {
        if (root == null)
            return 0;
        int left = digui(root.left);
        if (left == -1)
            return -1;
        int right = digui(root.right);
        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;
        else
            return Math.max(left, right) + 1;
    }
}
