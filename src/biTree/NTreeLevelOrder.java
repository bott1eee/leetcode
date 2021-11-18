package biTree;


import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NTreeLevelOrder {

    public class Node {

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

    /*
    与二叉树的层序遍历一样
     */
    public List<List<Integer>> nTreeLevelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            List<Integer> item = new ArrayList<>();
            while (length > 0) {
                Node node = queue.poll();
                item.add(node.val);
                if (node.children != null) {
                    for (Node childNode : node.children) {
                        queue.offer(childNode);
                    }
                }
                length--;
            }
            result.add(item);
        }
        return result;
    }
}
