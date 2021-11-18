package biTree;


import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Connect {

    public class Node {

        int val;
        Node left;
        Node right;
        Node next;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }

    /*
    层序遍历二叉树
    在每层中，使每个结点的 next 指向该层下一个结点
    每层只对前 length-1 个结点进行上述操作，最后一个结点指向 null
     */
    public Node connect(Node root) {

        if (root == null)
            return root;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            while (length > 0) {
                Node node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                if (length != 1)
                    node.next = queue.peek();
                length--;
            }
        }
        return root;
    }

    /*
    通过二叉树每层的最左孩子进行每层的遍历
    有两种情况：
    1、使层中的结点的左孩子的 next 指向该结点右孩子
    2、使层中的结点的右孩子的 next 指向该结点 next 结点的左孩子
     */
    public Node connect_2(Node root) {
        if (root == null)
            return root;

        Node tree_left = root;
        while (tree_left.left != null) {
            Node cur = tree_left;
            while (cur != null) {
                cur.left.next = cur.right;
                if (cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            tree_left = tree_left.left;
        }
        return root;
    }

    public Node connect_3(Node root) {

        Node tree_left = root;
        while (tree_left.left != null) {
            Node cur = tree_left;
            while (cur != null) {
                cur.left.next = cur.right;
                if (cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            tree_left = tree_left.left;
        }
        return root;
    }
}
