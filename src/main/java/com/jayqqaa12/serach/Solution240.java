package com.jayqqaa12.serach;

/**
 * 搜索矩阵 是否能找到 target
 *
 * 矩阵 从左到右 从上到下 是升序的
 *
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 *
 * 难度3星
 *
 */
public class Solution240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null||matrix.length==0||matrix[0].length==0)return false;


        int m =0;
        int n=matrix[0].length-1;

        while(m<matrix.length&& n >=0){

            if(matrix[m][n]==target)return true;

            if(matrix[m][n]<target)m++;
            else n--;
        }

        return  false;

    }
}