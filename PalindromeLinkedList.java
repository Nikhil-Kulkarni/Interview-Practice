// Implement a function to check if a linked list is a palindrome
// 1->2->3->2->1 -- true
// 1->2->3->1 -- false
// Node definition
// O(n)
public class Node {
    Node next;
    int data;
}

public boolean linkedListPalindrome(Node head) {
    Node slow = head;
    Node fast = head;
    Stack<Integer> stack = new Stack();
    while (fast != null || fast.next != null) {
        stack.push(slow.data);
        slow = slow.next;
        fast = fast.next.next;
    }
    if (fast != null) {
        slow = slow.next; // If linked list is odd length
    }
    while (slow != null) {
        if (stack.pop() != slow.data) {
            return false;
        }
        slow = slow.next;
    }
    return true;
}
