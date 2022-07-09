package codetop;

import java.util.List;

public class RemoveNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode slow = virtualHead;
        ListNode fast = virtualHead;
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
