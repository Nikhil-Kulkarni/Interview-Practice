public class MergeLinkedList {
    public static void main(String[] args) {

    }

    public Node merge(Node n1, Node n2) {
        Node currOne = n1;
        Node currTwo = n2;
        Node head = NULL;
        if (currOne.data > currTwo.data) {
            head = currOne;
            currOne = currOne.next;
        } else {
            head = currTwo;
            currTwo = currTwo.next;
        }
        Node curr = head;
        while (!currOne == NULL && !currTwo == NULL) {
            if (currOne.data > currTwo.data) {
                curr.next = currOne;
                currOne = currOne.next;
            } else {
                curr.next = currTwo;
                currTwo = currTwo.next;
            }
            curr = curr.next;
        }

        while (!currOne == NULL) {
            curr.next = currOne;
            currOne = currOne.next;
            curr = curr.next;
        }
        while (!currTwo == NULL) {
            curr.next = currTwo;
            currTwo = currTwo.next;
            curr = curr.next;
        }
        return head;
    }
}
