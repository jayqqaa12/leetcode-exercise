package com.jayqqaa12.dp;


/**
 * 求m*n的网格中 从1,1 出发到 m,n点 有多少不同路径
 *
 * 只能向下向右走
 *
 * 难度2星
 *
 */
public class Solution62 {

    /**
     * DP
     * f(m,n) = f(m-1,n)+f(m,n-1)
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {


        int [][] nums =new int[ m][n] ;
        for (int i = 0; i < m; i++) {
            nums[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            nums[0][i]=1;
        }

        for (int i = 1; i < m; i++) {

            for (int j =1; j < n; j++) {
                nums[i][j]=nums[i-1][j]+nums[i][j-1];
            }
        }
        
        return  nums[m-1][n-1];
    }
}