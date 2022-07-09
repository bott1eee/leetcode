package biTree;

import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.function.IntFunction;

public class LevelOrder {


    /*
    层序遍历
    使用栈解决问题
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int length = queue.size();

            while (length > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
            result.add(item);
        }
        return result;
    }

    public List<List<Integer>> levelOrder_2(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int length = queue.size();
            while (length > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                length--;
            }
            result.add(item);
        }
        return result;
    }


    public List<List<Integer>> order(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> item = new ArrayList<>();

            while (len > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                len--;
            }
            result.add(item);
        }
        return result;
    }

    public List<List<Integer>> level_2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            while (len > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                len--;
            }
            result.add(list);
        }
        return result;
    }
}
