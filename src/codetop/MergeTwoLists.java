package codetop;

import hot100.MergeTwoLists_21;

public class MergeTwoLists {

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

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode virtualHead = new ListNode();
        ListNode pre = virtualHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        if (list1 != null){
            pre.next = list1;
        }
        if (list2 != null) {
            pre.next = list2;
        }
        return virtualHead.next;
    }
}
