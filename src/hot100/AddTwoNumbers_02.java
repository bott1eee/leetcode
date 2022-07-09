package hot100;

public class AddTwoNumbers_02 {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = 0;
            int y = 0;
            if (l1 != null)
                x = l1.val;
            if (l2 != null)
                y = l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            ListNode n1 = new ListNode(sum % 10);
            cur.next = n1;
            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry != 0)
            cur.next = new ListNode(1);
        return pre.next;
    }
}