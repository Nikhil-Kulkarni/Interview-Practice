public class Factorize {
    public static void main(String[] args) {
        factorize(100);
    }

    public static void factorize(int n) {
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println(n);
    }
}
