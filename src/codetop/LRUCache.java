package codetop;

import com.sun.security.auth.UnixNumericUserPrincipal;
import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

    public class LinkedNode {
        int key;
        int value;
        LinkedNode pre;
        LinkedNode next;

        public LinkedNode() {
        }

        public LinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, LinkedNode> map = new HashMap<>();
    int size;
    int capacity;
    private LinkedNode head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new LinkedNode();
        tail = new LinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        LinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        LinkedNode node = map.get(key);
        if (node == null) {
            LinkedNode newNode = new LinkedNode(key, value);
            map.put(key, newNode);
            insertHead(newNode);
            size++;
            if (size > capacity) {
                LinkedNode removedNode = removeTail();
                map.remove(removedNode.key);
                size--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void removeNode(LinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void insertHead(LinkedNode node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void moveToHead(LinkedNode node) {
        removeNode(node);
        insertHead(node);
    }

    private LinkedNode removeTail() {
        LinkedNode node = tail.pre;
        removeNode(node);
        return node;
    }
}
