package codetop;

import linkedList.DetectCycle;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Intersection {

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

    public ListNode getIntersection(ListNode headA, ListNode headB) {

        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)){
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }
}
