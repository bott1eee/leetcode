package linkedList;

public class SwapPairs {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /*
    使用虚拟头节点，改变ListNode.next
     */
    public ListNode swapPairs(ListNode head) {
        ListNode virtualNode = new ListNode(0);
        virtualNode.next = head;
        ListNode pre = virtualNode;

        while (pre.next != null && pre.next.next != null) {
            ListNode temp = head.next.next;
            pre.next = head.next;
            head.next.next = head;
            head.next = temp;
            pre = head;
            head = head.next;
        }
        return virtualNode.next;
    }

    public ListNode swapPairs_2(ListNode head) {
        // base case 退出提交
        if (head == null || head.next == null) return head;
        // 获取当前节点的下一个节点
        ListNode next = head.next;
        // 进行递归
        ListNode newNode = new SwapPairs().swapPairs_2(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        new SwapPairs().swapPairs_2(listNode1);
    }

    public ListNode swapPairs_3(ListNode head) {
        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode pre = virtualHead;
        ListNode cur = virtualHead.next;
        while (pre.next != null && pre.next.next != null) {
            ListNode temp = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = temp;
            pre = cur;
            cur = cur.next;
        }
        return virtualHead.next;
    }
}
