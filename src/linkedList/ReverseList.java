package linkedList;

import java.util.List;

public class ReverseList {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}
    }

    public ListNode ReverseList(ListNode head){

        ListNode pre=null;
        ListNode cur=head;
        ListNode temp=null;
        while (cur!=null){
            temp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
