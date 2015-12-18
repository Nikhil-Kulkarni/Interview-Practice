public class LargestSmallBST {
    public static void main(String[] args) {

    }

    public Node largestSmallerThanK(Node root, int k, Node prev) {
        if (root == null) {
            return prev;
        }
        Node ans = null;
        if (k <= root.data) {
            ans = largestSmallerThanK(root.left, k, prev);
        }
        if (k > root.data) {
            prev = root;
            ans = largestSmallerThanK(root.right, k, prev);
        }
        return ans;
    }
}
