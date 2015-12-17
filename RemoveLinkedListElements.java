// Remove all elements from a linked list of integers that have value val.

public void removeElements(Node head, int val) {
    Node prev = head;
    Node curr = head;
    while (curr.next != null) {
        if (curr.next.data == val) {
            prev.next = curr.next;
        }
        prev = curr;
        curr = curr.next;
    }
}
