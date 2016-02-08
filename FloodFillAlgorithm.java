public class FloodFillAlgorithm {
    public static void main(String[] args) {

    }

    public static void fill(int[][] arr, int m, int n, int newColor, int currColor) {
        if (m < 0 || n < 0 || m >= arr.length || n >= arr[m].length) {
            return;
        }
        if (arr[m][n] != currColor) {
            return;
        }
        arr[m][n] = newColor;
        fill(arr, m - 1, n, newColor, currColor);
        fill(arr, m + 1, n, newColor, currColor);
        fill(arr, m, n - 1, newColor, currColor);
        fill(arr, m, n + 1, newColor, currColor);
    }
}
