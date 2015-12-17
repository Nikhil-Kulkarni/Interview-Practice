// Write a program to find the node at which the intersection of two singly linked lists begins.

// Find the offset from the longest length linked list
// Traverse side by side until node is the same for both lists
// O(2k + 2n) - k & n are lengths of the linked lists
public Node intersectionLinkedList(Node p1, Node p2) {
    Node curr1 = p1;
    Node curr2 = p2;

    int len1 = 0;
    int len2 = 0;

    while (p1 != null) {
        len1++;
        p1 = p1.next;
    }
    while (p2 != null) {
        len2++;
        p2 = p2.next
    }

    curr1 = p1;
    curr2 = p2;
    if (len1 > len2) {
        int diff = len1 - len2;
        int i = 0;
        while (i < diff) {
            curr1 = curr1.next;
        }
    } else {
        int diff = len2 - len1;
        int i = 0;
        while (i < diff) {
            curr2 = curr2.next;
        }
    }

    while (curr1 != null && curr2 != null) {
        if (curr1 == curr2) {
            return curr1;
        }
        curr1 = curr1.next;
        curr2 = curr2.next;
    }
    return null;
}
