// Implement an alogirthm to find the kth to last element of a singly linked list
// 4->5>6->7->8 find 2nd to last should return 7

public int kthToLast(Node head, int k) {
    Node current = head;
    Node kth = head;
    for (int i = 0; i < k-1; i++) {
        current = current.next;
    }
    while (current != null) {
        current = current.next;
        kth = kth.next;
    }
    return kth.data;
}
