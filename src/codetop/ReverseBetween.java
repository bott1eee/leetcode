package codetop;

import linkedList.DetectCycle;

import java.util.List;

public class ReverseBetween {

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

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode pre = virtualHead;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode rightNode = pre;
        for (int j = 0; j < right - left + 1; j++) {
            rightNode = rightNode.next;
        }
        ListNode leftNode = pre.next;
        ListNode cur = rightNode.next;
        pre.next = null;
        rightNode.next = null;
        reverseList(leftNode);
        pre.next = rightNode;
        leftNode.next = cur;
        return virtualHead.next;
    }

    public void reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
    }
}
