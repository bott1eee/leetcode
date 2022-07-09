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

    public ListNode removeElements_virtualNode_2(ListNode head, int val) {

        if (head == null)
            return head;

        ListNode virtualNode = new ListNode(0);
        virtualNode.next = head;
        ListNode pre = virtualNode;
        ListNode cur = virtualNode.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                //注意若遇到需删除结点，不需要移动pre指针。
                pre = pre.next;
            }
            cur = cur.next;
        }
        return virtualNode.next;
    }

    public ListNode remove(ListNode head, int val) {

        ListNode virtualNode = new ListNode();
        virtualNode.next = head;
        ListNode pre = virtualNode;
        ListNode cur = virtualNode.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return virtualNode.next;
    }


    public ListNode remove_2(ListNode head, int target) {

        ListNode virtualNode = new ListNode();
        virtualNode.next = head;
        ListNode pre = virtualNode;
        ListNode cur = virtualNode.next;
        while (cur != null) {
            if (cur.val == target) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return virtualNode.next;
    }


    public ListNode remove_3(ListNode head, int val) {
        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode cur = head;
        ListNode pre = virtualHead;
        while (cur != null) {
            if (cur.val == val){
                pre.next = cur.next;
            }else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return virtualHead.next;
    }
}
