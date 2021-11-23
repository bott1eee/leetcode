package biTree;


import java.util.*;

public class BinaryTreePaths {


    /*
    257-二叉树的所有路径
    迭代法
    使用前序遍历法遍历二叉树。
    每入栈一个节点，就将前面的路径作为字符串同时入栈
    判断只要遍历到叶子节点，就结束当前路径
     */
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<Object> stack = new Stack<>();
        stack.push(root);
        stack.push(String.valueOf(root.val));

        while (!stack.isEmpty()) {
            String path = String.valueOf(stack.pop());
            TreeNode node = (TreeNode) stack.pop();
            if (node.left == null && node.right == null) {
                result.add(path);
            }
            if (node.left != null) {
                stack.push(node.left);
                stack.push(path + "->" + node.left.val);
            }
            if (node.right != null) {
                stack.push(node.right);
                stack.push(path + "->" + node.right.val);
            }
        }
        return result;
    }

    /*
    递归法（回溯法）
    使用前序遍历
     */
    public List<String> binaryTreePaths_2(TreeNode root) {

        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        List<Integer> paths = new ArrayList<>();
        getPaths(root, paths, result);
        return result;
    }

    /**
     * 递归终止条件为
     * 找到叶子节点，即左右孩子都为空
     * 此时将 paths 转为路径字符串存入结果集
     * 若不为叶子节点，则继续向下递归遍历
     * 遍历到底时开始向上回溯，删除 paths 路径中的最后一个节点值
     *
     * @param root  节点
     * @param paths 路径
     * @param result    结果集
     */
    public void getPaths(TreeNode root, List<Integer> paths, List<String> result) {

        //记录中间节点的值
        paths.add(root.val);
        //找到叶子节点
        if (root.left == null && root.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < paths.size() - 1; i++) {
                stringBuilder.append(paths.get(i)).append("->");
            }
            stringBuilder.append(paths.get(paths.size() - 1));
            result.add(stringBuilder.toString());
        }
        //向下遍历
        if (root.left != null) {
            getPaths(root.left, paths, result);
            //回溯，删除最后一个节点
            paths.remove(paths.size() - 1);
        }
        if (root.right != null) {
            getPaths(root.right, paths, result);
            //回溯，删除最后一个节点
            paths.remove(paths.size() - 1);
        }
    }

    public List<String> binaryTreePaths_3(TreeNode root) {

        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<Object> stack = new Stack<>();
        stack.push(root);
        stack.push(String.valueOf(root.val));
        while (!stack.isEmpty()) {
            String path = String.valueOf(stack.pop());
            TreeNode node = (TreeNode) stack.pop();
            if (node.left == null && node.right == null) {
                result.add(path);
            }
            if (node.left != null) {
                stack.push(node.left);
                stack.push(path + "->" + node.left.val);
            }
            if (node.right != null) {
                stack.push(node.right);
                stack.push(path + "->" + node.right.val);
            }
        }
        return result;
    }

    public List<String> binaryTree_4(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;

        List<Integer> path = new ArrayList<>();
        getPaths(root,path,result);
        return result;
    }

    public void getPath(TreeNode root, List<Integer> path, List<String> result) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                stringBuilder.append(path.get(i)).append("->");
            }
            stringBuilder.append(path.get(path.size()-1));
            result.add(stringBuilder.toString());
        }
        if (root.left != null) {
            getPaths(root.left,path,result);
            path.remove(path.size()-1);
        }
        if (root.right != null) {

            getPaths(root.right,path,result);
            path.remove(path.size()-1);
        }
    }
}
