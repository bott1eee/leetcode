package linkedList;

import java.util.List;

public class RemoveElements {

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

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;

        if (head == null)
            return head;

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur!=null){
            if (cur.val==val){
                pre.next=cur.next;
            }else {
                pre=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}
