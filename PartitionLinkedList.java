// Write code to parittion a linked list around a value x,
// such that all nodes less than x come before all nodes greater than or equal to x
// x= 5 1->10->5->9->4 should return 1->4->10->5->9
// Node definition
// O(n)
public class Node {
    Node next;
    int data;
}

public Node parition(Node head, int x) {
    Node firstHalfHead;
    Node firstHalf;
    Node secondHalfHead;
    Node secondHalf;
    while (head != null) {
        if (head.data < x) {
            if (firstHalfHead == null) {
                firstHalfHead = head;
                firstHalf = firstHalfHead;
            } else {
                firstHalf.next = head;
                firstHalf = firstHalf.next;
            }
        } else {
            if (secondHalfHead == null) {
                secondHalfHead = head;
                secondHalf = secondHalfHead;
            } else {
                secondHalf.next = head;
                secondHalf = secondHalf.next;
            }
        }
    }
    if (firstHalfHead == null) {
        return secondHalfHead;
    }
    firstHalf.next = secondHalfHead;
    return firstHalfHead;
}
