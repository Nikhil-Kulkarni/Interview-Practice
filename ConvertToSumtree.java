public class ConvertToSumtree {
    public static void main(String[] args) {

    }

    // Using addition and subtraction
    public static int convert(Node root) {
        if (root.left == NULL && root.right == NULL) {
            return root.data;
        }
        int leftSum = convert(root.left);
        int rightSum = convert(root.right);
        int difference = leftSum + rightSum - root.data;
        root.data = root.data + difference;
        return root.data;
    }

    // Using only addition
    public static void fixWithAdd(Node root) {

    }
}
