package biTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValues {

    /*
    对二叉树进行层序遍历
    每次进行出队操作时，记录当前层的最大值，该层遍历结束后存入结果数组即可
     */
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            int max = queue.peek().val;
            while (length > 0) {
                TreeNode node = queue.poll();
                if (node.val > max)
                    max = node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
            result.add(max);
        }
        return result;
    }
}
