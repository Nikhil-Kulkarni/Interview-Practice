public class LevelOrderTraversal {
    public static void main(String[] args) {

    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.removeFirst();
            System.out.println(root.data);
            if (!root.left == NULL) {
                queue.add(root.left);
            }
            if (!root.right == NULL) {
                queue.add(root.right);
            }
        }
    }
}
