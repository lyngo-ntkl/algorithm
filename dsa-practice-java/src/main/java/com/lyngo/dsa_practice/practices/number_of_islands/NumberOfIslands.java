package com.lyngo.dsa_practice.practices.number_of_islands;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1 && !visited[row][col]) {
                    count++;
                    dfs(grid, visited, row, col, rows, cols);
                }
            }
        }
        return count;
    }

    private int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };

    private void dfs(char[][] grid, boolean[][] visited, int row, int col, int rows, int cols) {
        int newRow, newCol;
        for (int i = 0; i < 4; i++) {
            newRow = row + directions[i][0];
            newCol = col + directions[i][1];
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                && grid[newRow][newCol] == 1
                && !visited[newRow][newCol]) {
                visited[newRow][newCol] = true;
                dfs(grid, visited, newRow, newCol, rows, cols);
            }
        }
    }
}
