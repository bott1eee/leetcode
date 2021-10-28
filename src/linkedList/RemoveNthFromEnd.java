package linkedList;


public class RemoveNthFromEnd {

    public class ListNode {
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
    此方法使用虚拟头结点方法。若不使用虚拟头结点直接对其遍历，当链表中只有1个节点时，无法删除其节点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode fast = virtualHead;
        ListNode slow = virtualHead;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            fast = fast.next;
            slow = slow.next;
        }
        pre.next = slow.next;
        return virtualHead.next;
    }
}
