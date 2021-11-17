package biTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    /*
    递归法
     */
    public List<Integer> postOrderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    public void traversal(TreeNode root, List<Integer> result) {

        if (root == null)
            return;
        traversal(root.left, result);
        traversal(root.right, result);
        result.add(root.val);
    }

    /*
    迭代法
    先序遍历是中左右，这里改为中右左，然后再将结果颠倒为就是左右中了，也就是后序遍历
     */
    public List<Integer> postOrderTraversal_2(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.left!=null)
                stack.push(cur.left);
            if (cur.right!=null)
                stack.push(cur.right);
        }
        Collections.reverse(result);
        return result;
    }
}
