package biTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConvertLevelOrder {

    /*
    先使用迭代法正序层序遍历二叉树
    再将结果 list 逆置即可
     */
    public List<List<Integer>> convertLevelOrder(TreeNode root) {

        List<List<Integer>> result_temp = new ArrayList<>();
        if (root == null)
            return result_temp;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            length = queue.size();

            while (length > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
            result_temp.add(item);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = result_temp.size(); i >= 0; i--) {
            result.add(result_temp.get(i));
        }
        return result;
    }
}
