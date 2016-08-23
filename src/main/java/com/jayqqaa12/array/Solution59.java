package com.jayqqaa12.array;


/**
 * 给点n 返回一个 1-n 填充的 旋转矩阵
 * <p>
 * For example,
 * Given n = 3,
 * You should return the following matrix:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 * 难度2星
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int cur = 1;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while(cur <= n * n) {
            //left to right
            for(int j = colBegin ; j <= colEnd; j++){
                res[rowBegin][j] = cur++;
            }
            rowBegin++;
            //top to bot
            for( int i = rowBegin ; i <= rowEnd; i++){
                res[i][colEnd] = cur++;
            }
            colEnd--;
            //right to left
            for(int j = colEnd ; j >= colBegin; j--){
                res[rowEnd][j] = cur++;
            }
            rowEnd--;
            //bot to top
            for(int i = rowEnd; i >= rowBegin; i--){
                res[i][colBegin] = cur++;
            }
            colBegin++;
        }
        return res;
    }
}