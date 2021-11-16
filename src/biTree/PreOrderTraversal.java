package biTree;


import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

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
}
