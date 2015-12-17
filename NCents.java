public class NCents {
    public static void main(String[] args) {
        int[] options = {1, 5, 10, 25};
        int n = 10;
        System.out.println(numWays(n, options, 0));
    }

    public static int numWays(int amount, int[] options, int coinIndex) {
        if (coinIndex == options.length) {
            return 0;
        }
        if (amount == 0) {
            return 1;
        }
        int coin = options[coinIndex];
        int total = 0;
        for (int i = 0; amount - i*coin >= 0; i++) {
            total += numWays(amount - i*coin, options, coinIndex + 1);
        }
        return total;
    }
}
