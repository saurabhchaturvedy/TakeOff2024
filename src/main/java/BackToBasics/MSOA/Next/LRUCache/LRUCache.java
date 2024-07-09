package BackToBasics.MSOA.Next.LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {


    int capacity;

    Map<Integer, Node> cache;

    Node head;
    Node tail;


    LRUCache(int capacity) {

        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }


    public void put(int key, int value) {


        if (cache.containsKey(key)) {


            Node node = cache.get(key);

            node.value = value;

            node.prev.next = node.next;
            node.next.prev = node.prev;

            moveToHead(node);

            return;
        }


        if (capacity == cache.size()) {


            cache.remove(tail.prev.key);

            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }


        Node node = new Node(key, value);
        cache.put(key, node);

        moveToHead(node);
    }


    public int get(int key) {

        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);

        moveToHead(node);

        return node.value;
    }

    private void moveToHead(Node node) {


        node.prev = head;
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
    }


    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(5);

        lruCache.put(5,10);
        lruCache.put(6,9);
        lruCache.put(11,91);
        lruCache.put(13,29);
        lruCache.put(16,99);
        lruCache.put(26,39);


        System.out.println(lruCache.get(13));

       // System.out.println(lruCache.head.next.value);
    }
}
