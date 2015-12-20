public class GridShortestPath {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        System.out.println(minPath(grid, 0, 0, 2, 2, 0));
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

            grid[xStart][yStart] = 0;
        }
        return ways;
    }
}
