public class BSTCeiling {
    public static void main(String[] args) {

    }

    public static Integer ceiling(Node root, int key, Node prev) {
        if (root == null) {
            return prev.key;
        }
        if (root.key <= key) {
            prev = root;
            return ceiling(root.left, key, prev);
        } else {
            return ceiling(root.right, key, prev);
        }
    }
}
