package biTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {

    /*
    对二叉树进行层序遍历
    遍历完每一层后，记录每一层的总和，计算出平均值存入结果数组即可
     */
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            List<Integer> list = new ArrayList<>();
            while (length > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                length--;
            }
            double sum=0;
            for (Integer i:list)
                sum+=i;
            result.add(sum/(double)list.size());
        }
        return result;
    }

    public List<Double> averageOfLevels_2(TreeNode root) {

        List<Double> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            int length_temp = length;
            double sum=0;
            while (length > 0) {
                TreeNode node = queue.poll();
                sum+=node.val;
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                length--;
            }
            result.add(sum/length_temp);
        }
        return result;
    }
}
