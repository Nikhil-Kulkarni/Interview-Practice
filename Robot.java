public class Robot {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(dfs(x, y, 0, 0));
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

    public static int robotDP(int x, int y) {
        int[][] grid = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

            }
        }
    }
}
