package doublePointer;

public class DetectCycle {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode entrance = head;
//                while (true) {
//                    if (slow == entrance) {
//                        return entrance;
//                    }
//                    entrance = entrance.next;
//                    slow = slow.next;
//                }
                while (slow!=entrance){
                    entrance =  entrance.next;
                    slow = slow.next;
                }
                return entrance;
            }
        }
        return null;
    }
}
