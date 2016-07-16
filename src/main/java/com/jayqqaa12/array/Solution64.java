package com.jayqqaa12.array;


/*
 * 从给定的网格中找到最短路径
 *
 * 方向只能 down或 right
 *
 * 难度2星
 *
 * FIXME
 *
 */
public class Solution64 {

    /**
     * f(xy)= min(f(x-1,y),f(x,y-1))+a(x,y)
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {

        int m = grid.length;// row
        int n = grid[0].length; // column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) grid[i][j] = grid[i][j];
                else if (i == 0 && j != 0) grid[i][j] = grid[i][j] + grid[i][j - 1];
                else if (i != 0 && j == 0) grid[i][j] = grid[i][j] + grid[i - 1][j];
                else grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j]) + grid[i][j];

            }
        }

        return grid[m - 1][n - 1];


    }
}