package linkedList;

public class MyLinkedList {

    //size 存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        ListNode curNode = head;
        for (int i = 0; i <= index; i++)
            curNode = curNode.next;
        return curNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index < 0)
            index = 0;

        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode insertNode = new ListNode(val);
        insertNode.next = pre.next;
        pre.next = insertNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre=pre.next;
        }
        pre.next=pre.next.next;
        size--;
    }
}
