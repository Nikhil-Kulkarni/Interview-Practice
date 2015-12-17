// Write code to remove duplicates from a sorted linked list
// Node definition
// 6->7->7->8->9 should return 6->7->8->9
// O(n)

public class Node {
    Node next;
    int data;
}

public void removeDuplicates(Node head) {
    Node current = head;
    Node previous = null;
    while (current != null) {
        if (current == previous) {
            previous.next = current.next;
        } else {
            previous = current;
        }
        current = current.next;
    }
}
