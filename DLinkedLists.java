// Given a binary tree, design an algorithm which creates a linked list of
// all the nodes at each depth
// Node definition
public class Node {
    Node left;
    Node right;
    int data;
}

public ArrayList<LinkedList<Node>> createLinkedLists(Node head) {
    ArrayList<LinkedList<Node>> list = new ArrayList();
    listHelper(head, list, 0);
    return list;
}

public void listHelper(Node current, ArrayList<LinkedList<Node>> list, int depth) {
    if (current == null) {
        return;
    }
    if (depth == list.size()) {
        list.add(new LinkedList());
    }
    list.get(depth).add(current);
    listHelper(list.left, list, depth + 1);
    listHelper(list.right, list, depth + 1);
}
