public class Robot {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(robotDP(x, y, 0, 0));
    }

    public static int dfs(int x, int y, int currX, int currY) {
        if (currX == x && currY == y) {
            return 1;
        }
        if (currX > x || currY > y) {
            return 0;
        }
        return dfs(x, y, currX + 1, currY) + dfs(x, y, currX, currY + 1);
    }

    public static int robotDP(int x, int y, int z, int q) {
        int[][] grid = new int[x+1][y+1];
        for (int i = 0; i <= x; i++) {
            grid[i][0] = 1;
        }
        for (int i = 0; i <= y; i++) {
            grid[0][i] = 1;
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[x][y];
    }
}
