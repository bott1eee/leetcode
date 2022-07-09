package codetop;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = getArea(grid, i, j);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }

    public int getArea(int[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 2;
        return 1 + getArea(grid, i - 1, j) + getArea(grid, i + 1, j) + getArea(grid, i, j - 1) + getArea(grid, i, j + 1);
    }

}
