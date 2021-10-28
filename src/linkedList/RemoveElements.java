package linkedList;

import java.util.List;

public class RemoveElements {


    public ListNode removeElements_noVirtualNode(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;

        if (head == null)
            return head;

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public ListNode removeElements_virtualNode(ListNode head, int val) {

        if (head == null)
            return head;

        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode pre = virtualHead;
        ListNode cur = virtualHead.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return virtualHead.next;
    }
}
