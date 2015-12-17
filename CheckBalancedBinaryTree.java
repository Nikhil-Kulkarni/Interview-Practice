// Implement a function to check if a binary tree is balanced
// For this problem, a balanced tree is defined to be a tree
// such that the heights of the two substrees of any node never differ by
// more than one

public boolean isBalanced(Node root) {
    int result = checkHeight(root);
    if (result == -1) {
        return false;
    }
    return true;
}

public int checkHeight(Node root) {
    if (root == null) {
        // base case
        return 0;
    }
    int leftHeight = checkHeight(root.left);
    if (leftHeight == -1) {
        return -1;
    }
    int rightHeight = checkHeight(root.right);
    if (rightHeight == -1) {
        return -1;
    }
    int difference = Math.abs(leftHeight - rightHeight);
    if (difference > 1) {
        return -1;
    }
    return Math.max(leftHeight, rightHeight) + 1;
}
