package com.jayqqaa12.serach;

/**
 * 搜索target 是否在 矩阵中
 * <p>
 * 矩阵数字 从小到大排序
 * <p>
 * 难度2星
 */
public class Solution74 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0, j = matrix[0].length - 1;
        while (j >= 0 && i < matrix.length) {
            if (matrix[i][j] == target) return true;
            if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}