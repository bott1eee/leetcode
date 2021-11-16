package biTree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

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
}
