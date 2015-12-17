// You have two numbers represented by a linked list, where each node contains
// a single digit. The digits are stored in reverse order, such that the 1' digit is at the head of the list
// Write a function that adds the two numbers and returns the sum as a linked list
//    7->1->6     (617 + 295)
// +  5->9->2->9
//    ----------
//    2  1  9  9

public int additionLinkedList(Node p1, Node p2) {
    int carry = 0;
    int multFactor = 1;
    int result = 0;
    while (p1 != null || p2 != null) {
        int a = 0;
        int b = 0;
        if (p1 != null) {
            a = p1.data;
        }
        if (p2 != null) {
            b = p2.data;
        }
        result += ((carry + a + b) % 10) * multFactor;
        carry = (carry + a + b) / 10;
        if (p1 != null) {
            p1 = p1.next;
        }
        if (p2 != null) {
            p2 = p2.next;
        }
        multFactor *= 10;
    }
    if (carry != 0) {
        result += carry * multFactor;
    }
    return result;
}
