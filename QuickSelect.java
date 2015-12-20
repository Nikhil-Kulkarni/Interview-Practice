public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 3, 4, 2, 8, 2, 9};

        // Finds 2nd largest element in list O(n) - average / O(n^2) worst case
        System.out.println(quickSelect(arr, 2, 0, arr.length - 1));
    }

    public static int quickSelect(int[] arr, int k, int start, int end) {
        if (arr.length - k < 0) {
            return -1;
        }
        int pivot = start;
        int t = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = t;
        pivot = end;
        int index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        int temp = arr[index];
        arr[index] = arr[pivot];
        arr[pivot] = temp;
        pivot = index;

        if (arr.length - k == pivot) {
            return arr[pivot];
        }
        if (arr.length - k < pivot) {
            return quickSelect(arr, k, start, index - 1);
        } else {
            return quickSelect(arr, k, index + 1, end);
        }
    }
}
