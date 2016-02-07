public class Power {
    public static void main(String[] args) {
        System.out.println(pow(3, 3));
    }

    public static int pow(int a, int b) {
        int z = 1;
        while (b != 0) {
            if (b % 2 == 0) {
                b = b / 2;
                a = a * a;
            } else {
                b = b - 1;
                z = z * a;
            }
        }
        return z;
    }
}
