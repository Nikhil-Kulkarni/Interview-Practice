// Given a circular linked list, implement an algorithm which returns
// the node at the beginning of the loop
// Node definition
public class Node {
    Node next;
    int data;
}

public Node findLoop(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            break;
        }
    }
    if (fast == null || fast.next == null) {
        return null;
    }
    slow = head;
    while (slow != head) {
        slow = slow.next
        fast = fast.next;
    }
    return fast;
}
