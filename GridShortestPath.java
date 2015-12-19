public class GridShortestPath {
    public static void main(String[] args) {
        int[][] grid = new int[4][5];
        System.out.println(minPath(grid, 0, 0, 3, 4, 0));
    }

    public static int minPath(int[][] grid, int xStart, int yStart, int xEnd, int yEnd, int n) {
        if (xStart < 0 || yStart < 0 || xStart >= grid.length || yStart >= grid[0].length) {
            return 0;
        }
        int ways = 0;
        if (grid[xStart][yStart] == -1) {
            return 0;
        }
        if (xStart == xEnd && yStart == yEnd) {
            return n;
        } else {
            grid[xStart][yStart] = -1;
             ways = Math.min(1 + minPath(grid, xStart + 1, yStart, xEnd, yEnd, n + 1), Math.min(1 + minPath(grid, xStart - 1, yStart, xEnd, yEnd, n + 1),
                Math.min(1 + minPath(grid, xStart, yStart + 1, xEnd, yEnd, n + 1), 1 + minPath(grid, xStart, yStart - 1, xEnd, yEnd, n + 1))));
            grid[xStart][yStart] = 0;
        }
        return ways;
    }
}
