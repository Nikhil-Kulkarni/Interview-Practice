public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,7,8,6,1,0,2,10};
        merge(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int divide(int[] arr, int start, int end) {
        int pivot = start;
        int temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;
        pivot = end;

        // Move all elements < pivot to beginning
        int index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= arr[pivot]) {
                int t = arr[index];
                arr[index] = arr[i];
                arr[i] = t;
                index++;
            }
        }

        // Move pivot to correct position
        int t = arr[index];
        arr[index] = arr[pivot];
        arr[pivot] = t;
        pivot = index;
        return index;
    }

    public static void merge(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int divideIndex = divide(arr, start, end);

        merge(arr, start, divideIndex - 1);
        merge(arr, divideIndex + 1, end);
    }
}
