// Implement a function to check if a binary tree is a binary search tree
//      3
//     / \
//    2   4
//

Node prev;
public boolean isBST(Node root) {
    if (root == null) {
        return true;
    }
    if (!isBST(root.left)) {
        return false;
    }
    if (prev != null && root.data <= prev.data) {
        return false;
    }
    prev = root;
    if (!isBST(root.right)) {
        return false;
    }
}
