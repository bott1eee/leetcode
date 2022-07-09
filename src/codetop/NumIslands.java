package codetop;

public class NumIslands {

    public int numIslands(char[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfsIsland(grid, i , j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfsIsland(char[][] grid, int i , int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 2;

        dfsIsland(grid, i - 1, j);
        dfsIsland(grid, i + 1, j);
        dfsIsland(grid, i, j - 1);
        dfsIsland(grid, i , j + 1);
    }
}
