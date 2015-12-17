// Given a linked list, swap every two adjacent nodes and return its head.
// For example, given 1->2->3->4, you should return the list as 2->1->4->3
// You may not modify the values in the list, only nodes themselves can be changed

public Node swapAdjacents(Node head) {
    Node current = head;
    Node newHead;
    if (current.next != null) {
        newHead = current.next.next;
    }
    while (current != null && current.next != null) {
        Node temp = current.next;
        temp.next = current;
        current.next = current.next.next;
        current = current.next.next;
    }
    return newHead;
}
