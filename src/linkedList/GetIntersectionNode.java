package linkedList;

import com.sun.xml.internal.ws.api.message.Header;

import java.util.HashMap;
import java.util.Map;

public class GetIntersectionNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /*
    求两个链表的长度，使其尾部对齐，同时使短链表的头节点对齐长链表的中间节点，然后遍历判断节点是否相等。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA = 0, lenB = 0;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lenA < lenB) {
            ListNode temp = tempA;
            tempA = tempB;
            tempB = temp;
        }
        int diff = Math.abs(lenA - lenB);
        while (diff > 0) {
            tempA = tempA.next;
            diff--;
        }

        while (tempA != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode_2(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA = 0, lenB = 0;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lenB > lenA) {
            ListNode temp = tempA;
            tempA = tempB;
            tempB = temp;
        }
        int diff = Math.abs(lenA - lenB);
        while (diff > 0) {
            tempA = tempA.next;
            diff--;
        }
        while (tempA != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }

    public ListNode getIntersect(ListNode headA, ListNode headB) {

        Map<ListNode, Integer> map = new HashMap<>();

        while (headA != null) {
            map.put(headA, 1);
            headA = headA.next;
        }
        while (headB != null) {
            if (map.get(headB) != null)
                return headB;
            headB = headB.next;
        }
        return null;
    }

    public ListNode getInter(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;

        while (h1 != h2) {
            if (h1 != null) {
                h1 = h1.next;
            } else {
                h1 = headB;
            }
            if (h2 != null) {
                h2 = h2.next;
            } else {
                h2 = headA;
            }
        }
        return h1;
    }

    public ListNode getInter_2(ListNode headA, ListNode headB) {

        Map<ListNode, Integer> map = new HashMap<>();
        while (headA != null) {
            map.put(headA, 1);
            headA = headA.next;
        }
        while (headB != null) {
            if (map.containsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public ListNode getInter_3(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lengthA < lengthB) {
            ListNode temp = tempA;
            tempA = tempB;
            tempB = temp;
        }
        int diff = Math.abs(lengthA - lengthB);
        while (diff > 0) {
            tempA = tempA.next;
            diff--;
        }
        while (tempA != null) {
            if (tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
