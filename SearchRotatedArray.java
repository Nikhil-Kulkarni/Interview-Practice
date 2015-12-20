public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] one = {2, 3, 4, 5, 6, 0, 1};
        int[] arr = {4, 5, 6, 0, 1, 2, 3};
        System.out.println(search(arr, 0, arr.length - 1, 1));
    }

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target < arr[mid] && target >= arr[start]) {
                return search(arr, start, mid - 1, target);
            } else {
                return search(arr, mid + 1, end, target);
            }
        } else {
            if (target > arr[mid] && target <= arr[end]) {
                return search(arr, mid + 1, end, target);
            } else {
                return search(arr, start, mid - 1, target);
            }
        }
    }
}
