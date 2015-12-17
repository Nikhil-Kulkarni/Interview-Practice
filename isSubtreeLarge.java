// You have two very large binary trees: T1, with millions of nodes, and T2,
// with hundreds of nodes. Create an algorithm to decide if T2 is a subtree
// of T1
// O(n + km), where k is the number of occurrences of T2's root in T1
public boolean isSubtree(Node T1, Node T2) {
    if (T2 == null) {
        return false;
    }
    return check(T1, T2);
}

public boolean check(Node T1, Node T2) {
    if (T1 == null) {
        return false;
    }
    if (T1.data == T2.data) {
        if (traverse(T1, T2)) {
            return true;
        }
    }
    return check(T1.left, T2) || check(T1.right, T2);
}

public boolean traverse(Node T1, Node T2) {
    if (T1 == null && T2 == null) {
        return true;
    }
    if (T1.data != T2.data) {
        return false;
    }
    if (T1 == null || T2 == null) {
        return false;
    }
    return traverse(T1.left, T2.left) && traverse(T1.right, T2.right);
}
