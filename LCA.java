// Design an algorithm and write code to find the first common ancestor of two
// nodes in a binary tree

// Most optimal
public Node LCA(Node root, Node p, Node q) {
    if (root == null) {
        return null;
    }
    if (root == p || root == q) {
        return root;
    }
    Node findLeft = LCA(root.left, p, q);
    Node findRight = LCA(root.right, p, q);
    if (findLeft != null && findRight != null) {
        return root;
    }
    if (findLeft != null && findRight == null) {
        return findLeft;
    }
    if (findRight != null && findLeft == null) {
        return findRight;
    }
    return null;
}

// Not as optimal
public Node LCA(Node root, Node p, Node q) {
    if (root == null) {
        return null;
    }
    if (root == p || root == q) {
        return root;
    }
    boolean pOnLeft = covers(root.left, p);
    boolean qOnLeft = covers(root.right, q);

    if (pOnLeft != qOnLeft) {
        return root;
    }
    if (pOnLeft && qOnLeft) {
        return LCA(root.left, p, q);
    }
    return LCA(root.right, p, q);
}

public boolean covers(Node root, Node p) {
    if (root == null) {
        return false;
    }
    if (root == p) {
        return true;
    }
    return covers(root.left, p) || covers(root.right, p);
}
