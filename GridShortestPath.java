public class GridShortestPath {
    public static void main(String[] args) {
        int[][] grid = new int[3][5];
        System.out.println(minPath(grid, 0, 0, 2, 4, 0));
    }

    public static int minPath(int[][] grid, int xStart, int yStart, int xEnd, int yEnd, int n) {
        if (xStart < 0 || yStart < 0 || xStart >= grid.length || yStart >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        int ways = 0;
        if (grid[xStart][yStart] == -1) {
            return Integer.MAX_VALUE;
        }
        if (xStart == xEnd && yStart == yEnd) {
            return n;
        } else {
            grid[xStart][yStart] = -1;
             ways = Math.min(minPath(grid, xStart + 1, yStart, xEnd, yEnd, n + 1), Math.min(minPath(grid, xStart - 1, yStart, xEnd, yEnd, n + 1),
                Math.min(minPath(grid, xStart, yStart + 1, xEnd, yEnd, n + 1), minPath(grid, xStart, yStart - 1, xEnd, yEnd, n + 1))));
            grid[xStart][yStart] = 0;
        }
        return ways;
    }
}
