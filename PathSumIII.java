// Given a binary tree and a sum, find all root-to-leaf paths where each path's
// sum equals the given sum

public ArrayList<ArrayList<Integer>> pathSum(Node root, int sum) {
    ArrayList<ArrayList<Integer> list = new ArrayList();
    ArrayList<Integer> path = new ArrayList();
    pathSum(root, sum, 0, list, path);
    return list;
}

public void pathSum(Node node, int sum, int tsum, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> path) {
    if (node.left == null && node.right == null && sum == tsum) {
        list.add(path);
    }

    if (node.left != null) {
        path.add(node.left);
        tsum += node.left.data;
        pathSum(node.left, sum, tsum, list, path);
        path.remove(path.size() - 1);
    }

    if (node.right != null) {
        path.add(node.right);
        tsum += node.right.data;
        pathSum(node.right, sum, tsum, list, path);
        path.remove(path.size() - 1);
    }
}
