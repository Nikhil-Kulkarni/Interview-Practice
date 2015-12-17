// Given a singly linked list, return the list reversed
// 4->5->6->7 should return 7->6->5->4
// Node definition
public class Node {
    Node next;
    int data;
}

public void reverseLinkedList(Node head) {
    Node current = head;
    Node previous = null;
    Node next = head.next;
    while (current != null) {
        next = current.next;
        current.next = previous;
        current = next;
        previous = current;
    }
    head = previous;
}
