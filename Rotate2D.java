// Given an N x N matrix, rotate it clockwise 90 degrees
public void rotate2d(int[] arr, int n) {
    for (int i = 0; i < n/2; i++) {
        for (int j = 0; j < Math.ceil((double)n / 2); j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][n - 1 - i];
            arr[j][n - 1 - i] = arr[n - 1 - i][n - 1 - j];

        }
    }
}
