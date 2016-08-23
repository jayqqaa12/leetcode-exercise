package com.jayqqaa12.dp;


/**
 * 给出三个字符串:s1、s2、s3，判断s3是否由s1和s2交叉构成。
 *
 * 难度3星
 *
 */
public class Solution97 {
    public boolean isInterleave(String s1, String s2, String s3) {

        if ((s1.length()+s2.length())!=s3.length()) return false;

        boolean[][] dp = new boolean[s2.length()+1][s1.length()+1];

        dp[0][0] = true;

        for (int i = 1; i < dp[0].length; i++){
            dp[0][i] = dp[0][i-1]&&(s1.charAt(i-1)==s3.charAt(i-1));
        }

        for (int i = 1; i < dp.length; i++){
            dp[i][0] = dp[i-1][0]&&(s2.charAt(i-1)==s3.charAt(i-1));
        }

        for (int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp[0].length; j++){
                dp[i][j] = (dp[i-1][j]&&(s2.charAt(i-1)==s3.charAt(i+j-1)))
                        || (dp[i][j-1]&&(s1.charAt(j-1)==s3.charAt(i+j-1)));
            }
        }

        return dp[s2.length()][s1.length()];

    }
}