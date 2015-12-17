// Given a binary search tree, write a function kthSmallest to find the kth smallest element in it. (1 ≤ k ≤ BST's total elements)
// Node definition
public class Node {
    Node next;
    int data;
}

// Solution using inorder traversal and extra array
public int kthSmallest(Node root, int k) {
    Node current = root;
    ArrayList<Integer> list = new ArrayList<Integer>();
    inOrder(root, list);
    return list.get(k).data;
}

public void inOrder(root, list) {
    if (root == null) {
        return;
    }
    inOrder(root.left);
    list.add(root);
    inOrder(root.right);
}

// Better solution: Recurse all the way left, pop out, and break when you reach the kth element
public void kthSmallest(Node root, int k, int[] arr) {
    if (root == null) {
        arr[0]++;
        return;
    }
    kthSmallest(root.left, k, arr);
    if (k == arr[0]) {
        arr[0] = root.data;
        return;
    }
    kthSmallest(root.right, k, arr);
}

public int smallest(Node root, int k) {
    int[] arr = new int[1];
    arr[0] = 0;
    kthSmallest(root, k, arr);
    return arr[0];
}
