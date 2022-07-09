package linkedList;

import java.util.List;

public class ReverseList {

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

    //双指针法
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    //递归法
    public ListNode reverseList_2(ListNode head) {
        return reverse(null, head);
    }

    public ListNode reverse(ListNode pre, ListNode cur) {
        if (cur == null)
            return pre;
        ListNode temp = cur.next;
        cur.next = pre;
        pre = cur;
        cur = temp;
        return reverse(pre, cur);
    }

    public ListNode reverseList_3(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;

        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverse_2(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverseListt(ListNode head){
        return reverse_3(null,head);
    }

    public ListNode reverse_3(ListNode pre, ListNode cur) {

        if (cur == null){
            return pre;
        }
        ListNode temp = null;
        temp = cur.next;
        cur.next = pre;
        return reverse_3(cur,temp);

    }
}
