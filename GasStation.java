public class GasStation {
    public static void main(String[] args) {

    }

    public static int canGoAround(int[] cost, int gas[], int n) {
        int runningCost = 0;
        int runningGas = 0;

        for (int i = 0; i < n; i++) {
            runningGas += gas[0];
            runningCost += cost[i % n];
            if (runningCost > runningGas) {
                return -1;
            }
        }
        return 0;
    }
}
