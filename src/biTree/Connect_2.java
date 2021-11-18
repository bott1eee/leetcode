package biTree;


import java.util.LinkedList;
import java.util.Queue;

public class Connect_2 {

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
    定义两个指针 pre 和 cur
    在每层中每遍历一个节点，就将 pre.next 指向 cur
    然后将 pre 往前移
     */
    public Node connect(Node root) {

        if (root == null)
            return root;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int length = 0;
        while (!queue.isEmpty()) {
            length = queue.size();
            Node pre = null;
            Node cur = null;
            for (int i = 0;i<length;i++){
                if (i==0){
                    cur = queue.poll();
                    pre = cur;
                }else {
                    cur = queue.poll();
                    pre.next = cur;
                    pre = pre.next;
                }
                if (cur.left!=null)
                    queue.offer(cur.left);
                if (cur.right!=null)
                    queue.offer(cur.right);
            }
        }
        return root;
    }
}
