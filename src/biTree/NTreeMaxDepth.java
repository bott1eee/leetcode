package biTree;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NTreeMaxDepth {


    /*
    559-N叉树的最大深度
    求 N叉树的最大深度，与求二叉树的最大深度方法一样
     */
    class Node {
        public int val;
        public List<Node> children;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public int nTreeMaxDepth(Node root) {

        if (root == null)
            return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        int depth = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            depth++;
            while (length > 0) {
                Node node = queue.poll();
                if (node.children != null)
                    for (Node one : node.children)
                        queue.offer(one);
                length--;
            }
        }
        return depth;
    }

    public int nTreeMaxDepth_2(Node root) {
        if (root == null)
            return 0;
        int depth = 0;
        if (root.children != null) {
            for (Node child : root.children) {
                depth = Math.max(depth, nTreeMaxDepth_2(child));
            }
        }
        return depth + 1;
    }
}
