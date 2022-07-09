package biTree;


import linkedList.DetectCycle;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    /*
    递归法
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    public void traversal(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        traversal(root.left, result);
        traversal(root.right, result);
    }

    /*
    迭代法
    使用栈存储结点，先存储右节点再存储左节点
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return result;
    }

    public List<Integer> preOrderTraversal_3(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
        return result;
    }

    public List<Integer> preorderTraversal_2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        digui(root,result);
        return result;
    }

    public void digui(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        result.add(node.val);
        digui(node.left,result);
        digui(node.right,result);
    }
}
