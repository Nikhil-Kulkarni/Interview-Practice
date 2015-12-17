// You are given a binary tree in which each node contains an integer value (+ / -)
// Design an algorithm to print all paths which sum to a given value.
// The path does not need to start or end at the root or a leaf, but it must
// go in a straight line down.

public void pathSum(Node root, int sum, int[] path, int level) {
    if (root == null) {
        return;
    }
    path[level] = root.data;

    int tsum = 0;
    for (int i = level; i >= 0; i++) {
        tsum += path[i];
        if (tsum == sum) {
            print(path, i, level);
        }
    }

    pathSum(root.left, sum, path, level + 1);
    pathSum(root.right, sum, path, level + 1);
}

public void pathSum(Node root, int sum) {
    if (root == null) {
        return;
    }
    int[] path = new path[depth(node)];
    pathSum(root, sum, path, 0);
}

public int depth(Node node) {
    if (node == null) {
        return 0;
    }
    return 1 + Math.max(depth(node.left), depth(node.right));
}
