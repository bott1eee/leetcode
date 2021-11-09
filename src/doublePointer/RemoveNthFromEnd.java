package doublePointer;

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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode virtualNode = new ListNode();
        virtualNode.next = head;
        ListNode fast = virtualNode;
        ListNode slow = virtualNode;

        while (n > 0) {
            fast = fast.next;
            n--;
        }
        ListNode pre = null;
        while (fast != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = slow.next;
        return virtualNode.next;
    }

    public ListNode removeNthFromEnd_2(ListNode head, int n) {

        ListNode virtualNode = new ListNode();
        virtualNode.next = head;
        ListNode fast = virtualNode;
        ListNode slow = virtualNode;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        ListNode pre = null;
        while (fast != null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = slow.next;
        return head;
    }
}
