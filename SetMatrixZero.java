public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{2, 0, 1}, {0, 1, 3}, {9, 3, 1}};
        setZero(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZero(int[][] arr) {
        boolean rowZero = false;
        boolean colZero = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                colZero = true;
            }
            if (arr[0][i] == 0) {
                rowZero = true;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[0][i] == 0) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = 0;
                }
            }
            if (arr[i][0] == 0) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for (int i = 0; i < arr.length; i++) {
                arr[0][i] = 0;
            }
        }
        if (colZero) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
