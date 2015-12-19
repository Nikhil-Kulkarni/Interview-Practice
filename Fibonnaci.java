public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(generateDP(8));
    }

    public static int generate(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return generate(n - 1) + generate(n - 2);
        }
    }

    public static int generateDP(int n) {
        int[] matrix = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                matrix[i] = 0;
            } else if (i == 1) {
                matrix[i] = 1;
            } else {
                matrix[i] = matrix[i - 1] + matrix[i - 2];
            }
        }
        return matrix[n];
    }
}
