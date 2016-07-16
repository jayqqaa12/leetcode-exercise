package com.jayqqaa12.array;


/**
 * 如果一个矩阵的 有元素为0 设置其所在的row column 也为0
 *
 * 不用额外的空间存储
 *
 *
 * 难度2星
 */
public class Solution73 {


    /**
     * 使用第一行第一列存 位置信息
     *
     * 如果0 在第一行第一列 就标记一下
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {

        boolean fr = false,fc = false;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }



    }
}