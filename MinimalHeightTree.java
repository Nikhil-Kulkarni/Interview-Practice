// Given a sorted (increasing order) array with unique integer elements,
// write an algorithm to create a binary search tree with minimal height
// [1, 2, 3, 4]
/*          3
 *         / \
 *        2   4
 *       /
 *      1
*/

public Node createMinimalHeightTree(int[] arr) {
    return minHeightTree(arr, 0, arr.length - 1);
}

public Node minHeightTree(int[] arr, start, end) {
    if (start > end) {
        return null;
    }
    int mid = (start + end) / 2;
    Node n = arr[mid];
    n.left = minHeightTree(arr, start, mid - 1);
    n.right = minHeightTree(arr, mid + 1, end);
    return n;
}
