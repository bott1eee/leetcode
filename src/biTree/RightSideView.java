package biTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

    /*
    先对二叉树进行层序遍历，得到 List<List<Integer>> 结果
    取 List<List<Integer>> 中的每项 List 的最后一个元素，即为最右边视角的元素
     */
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        List<List<Integer>> allResult = new ArrayList<>();
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
            allResult.add(item);
        }
        for (List<Integer> list : allResult) {
            result.add(list.get(list.size() - 1));
        }
        return result;
    }

    /*
    上述方法对二叉树层序遍历时将所有结点存入结果数组里
    这里不同的是
    先将结点的右孩子入队，再将左孩子入队
    然后对每层循环结束后，将队列的 peek 元素的值存入结果数组里，即为最右视角的值
     */
    public List<Integer> rightSideView_2(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            result.add(queue.peek().val);
            length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                if (node.right != null)
                    queue.offer(node.right);
                if (node.left != null)
                    queue.offer(node.left);
                length--;
            }
        }
        return result;
    }
}
