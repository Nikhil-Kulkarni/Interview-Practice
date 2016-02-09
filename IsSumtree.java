public class IsSumtree {
    public static void main(String[] args) {

    }

    public boolean sumtree(Node root) {
        if (isSumtree(root) != -1) {
            return true;
        }
        return false;
    }

    public int isSumtree(Node root) {
        if (root.left == NULL && root.right == NULL) {
            return root.data;
        }
        int leftSum = isSumtree(root.left);
        int rightSum = isSumtree(root.right);
        if (leftSum == -1 || rightSum == -1) {
            return -1;
        }
        if (leftSum + rightSum == root.data) {
            return root.data + leftSum + rightSum;
        } else {
            return -1;
        }
    }

    public int convertToSumtree(Node root) {
        if (root.left == NULL && root.right == NULL) {
            int temp = root.data;
            root.data = 0;
            return temp;
        }
        int leftSum = convertToSumtree(root.left);
        int rightSum = convertToSumtree(root.right);
        int temp = root.data;
        root.data = leftSum + rightSum;
        return leftSum + rightSum + temp;
    }
}
