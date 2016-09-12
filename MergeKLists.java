import java.util.*;
public class MergeKLists {
    public static void main(String[] args) {

    }

    public Node merge(ArrayList<Node> list) {
        PriorityQueue<Node> queue = new PriorityQueue<Node>(list.size(),
                new Comparator<T>() {
                    @Override
                    public int compare(Node n1, Node n2) {
                        return n1.data - n2.data;
                    }
                });
        Node head = new Node();
        Node curr = head;
        for (Node n : list) {
            if (n != null) {
                queue.add(n);
            }
        }

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            curr.next = temp;
            if (temp.next != null) {
                queue.add(temp.next);
            }
            curr = curr.next;
        }
        return head.next;
    }
}
