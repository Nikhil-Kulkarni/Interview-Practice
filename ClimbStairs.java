public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairsDP(4));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static int climbStairsDP(int n) {
        if (n == 1) {
            return 1;
        }
        int[] grid = new int[n + 1];
        grid[1] = 1;
        grid[2] = 2;
        for (int i = 3; i <= n; i++) {
            grid[i] = grid[i - 1] + grid[i - 2];
        }
        return grid[n];
    }
}
