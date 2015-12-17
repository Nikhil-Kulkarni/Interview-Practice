// Given two binary trees, write a function to check whether they are equal or not
// Two binary trees are equal if they have to same structure and same nodes

public isSameTree(Node t1, Node t2) {
    if (t1 == null && t2 == null) {
        return true;
    }
    if (t1 == null || t2 == null) {
        return false;
    }
    if (t1.data != t2.data) {
        return false;
    }
    return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
}
