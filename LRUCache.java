// Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
//
// get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
// set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
// it should invalidate the least recently used item before inserting a new item.

public class LRUCache {
    private Node head;
    private Node tail;
    private HashMap<Integer, Node> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = null;
        this.tail = null;
    }

    public void set(int key, int value) {
        Node newItem = new Node(key, value);
        if (this.map.containsKey(key)) {
            Node n = this.map.get(key);
            n.data = value;
            useCacheItem(n);
        }
        else if (this.map.size() >= capacity) {
            evictAndReplaceFromCache(head, newItem);
        }
        else {
            if (head == null) {
                head = newItem;
            }
            if (end != null) {
                end.next = newItem;
            }
            end = newItem;
        }
    }

    private void evictAndReplaceFromCache(Node n, Node newItem) {
        if (head.next != null) {
            Node next = head.next;
            next.prev = null;
            head = next;
        }
        end.next = newItem;
        newItem.prev = end;
        end = newItem;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            useCacheItem(n);
            return n.data;
        }
        return -1;
    }

    private void useCacheItem(Node n) {
        if (n.prev != null) {
            Node temp = n.prev;
            temp.prev = n.next;
        }
        if (n.next != null) {
            Node temp = n.next;
            temp.prev = n.prev;
            end.next = n;
            end = n;
        }
    }
}
