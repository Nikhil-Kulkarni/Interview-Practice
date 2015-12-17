// Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
// Given n = 3,
// You should return the following matrix:
// [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]

public int[] spiralMatrix(int n) {
    int[][] arr = new int[n][n

    int top = 0;
    int bot = n - 1;

    int right = n -1;
    int left = n;

    int a = 1;

    int dir = 0;
    while (top <= bot && left <= right) {
        if (dir == 0) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = a;
                a++;
            }
            top++;
        }
        if (dir == 1) {
            for (int i = top; i <= bot; i++) {
                arr[i][right] = a;
                a++;
            }
            right--;
        }
        if (dir == 2) {
            for (int i = right; i >= left; i--) {
                arr[bot][i] = a;
                a++;
            }
            bot--;
        }
        if (dir == 3) {
            for (int i = bot; i >= top; i--) {
                arr[i][left] = a;
                a++;
            }
            left++;
        }
        dir = (dir + 1) % 4;
    }
    return arr;
}
