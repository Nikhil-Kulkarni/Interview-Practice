// Write code to remove duplicates from an unsorted linked list

// Node definition
public class Node {
    Node next;
    int data;
}

public void removeDuplicates(Node head) {
    HashSet<Integer> set = new HashSet();
    Node current = head;
    Node previous = null;
    while (current != null) {
        if (set.contains(current.data)) {
            previous.next = current.next;
        } else {
            set.add(current.data);
            previous = current;
        }
        current = current.next;
    }
}
