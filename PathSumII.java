// Given a binary tree and a sum, determine if the tree has a root-to-leaf
// path such that adding up all the values along the path equals the given sum

// Depth First Search
public boolean pathSum(Node root, int sum, int tsum) {
    if (root == null) {
        return false;
    }
    tsum += root.data;
    if (root.left == null && root.right == null && sum == tsum) {
        return true;
    }
    if (root.left == null && root.right == null && sum != tsum) {
        return false;
    }
    return pathSum(root.left, sum, tsum) || pathSum(root.right, sum, tsum);
}

public boolean pathSum(Node root, int sum) {
    return pathSum(root, sum, 0);
}

// Breadth First Search
public boolean pathSum(Node root, int sum) {
    Queue<Node> nodes = new Queue();
    Queue<Integer> values = new Queue;
    queue.enqueue(root);
    values.enqueue(root.data);
    while (!(queue.isEmpty())) {
        Node node = queue.dequeue();
        int value = values.dequeue();
        if (node.right == null && node.left == null && value == sum) {
            return true;
        }
        if (node.left != null) {
            queue.enqueue(node.left);
            values.enqueue(value + node.left.data);
        }
        if (node.right != null) {
            queue.enqueue(node.right);
            values.enqueue(value + node.right.data);
        }
    }
    return false;
}
