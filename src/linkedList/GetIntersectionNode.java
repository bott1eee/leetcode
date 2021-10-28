package linkedList;

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
        int diff = Math.abs(lenA-lenB);
        while (diff>0){
            tempA=tempA.next;
            diff--;
        }

        while (tempA!=null){
            if (tempA== tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}