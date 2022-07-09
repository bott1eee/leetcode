package linkedList;

import java.util.List;

public class DetectCycle {

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

    /*
    使用双指针法解题
    快指针每次走两步，慢指针每次走一步。判断快指针与慢指针是否相遇，判断链表是否存在环
    定义一个新指针从头节点与慢指针同时出发，每次走一步，相遇的节点即为环的入口
     */
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //判断快慢指针相遇
            if (slow == fast) {
                ListNode entrance = head;
                while (true) {
                    if (entrance == slow) {
                        return entrance;
                    }
                    entrance = entrance.next;
                    slow = slow.next;
                }

            }
        }
        return null;
    }

    public ListNode detectCycle_2(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                ListNode entrance = head;
                while (true) {
                    if (entrance == slow) {
                        return entrance;
                    }
                    entrance = entrance.next;
                    slow = slow.next;
                }
            }
        }
        return null;
    }

    public ListNode detect(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //说明有环
            if (slow == fast) {
                ListNode entrace = head;
                while (true) {
                    if (entrace == slow) {
                        return entrace;
                    }
                    slow = slow.next;
                    entrace = entrace.next;
                }
            }
        }
        return null;
    }
}
