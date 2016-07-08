package com.jayqqaa12.math;


import java.util.Arrays;

/**
 * 求完美平方的数量
 * <p>
 * 完美平方为  4=2+2 =2平方 9=3+3+3 = 3的平方
 * 1，4，9，16 等  都是完美平方
 * <p>
 * For example,
 * given n = 12, return 3 because 12 = 4 + 4 + 4;
 * given n = 13, return 2 because 13 = 4 + 9.
 * <p>
 * 难度3星
 */
public class Solution279 {

    /**
     * 如果一个数x可以表示为一个任意数a加上一个平方数b∗b，
     * 也就是x=a+b∗b，那么能组成这个数x最少的平方数个数，就是能组成a最少的平方数个数加上1（因为b∗b已经是平方数了）。
     * <p>
     * dp[0] = 0
     * dp[1] = dp[0]+1 = 1
     * dp[2] = dp[1]+1 = 2
     * dp[3] = dp[2]+1 = 3
     * dp[4] = Min{ dp[4-1*1]+1, dp[4-2*2]+1 }
     * = Min{ dp[3]+1, dp[0]+1 }
     * = 1
     * dp[5] = Min{ dp[5-1*1]+1, dp[5-2*2]+1 }
     * = Min{ dp[4]+1, dp[1]+1 }
     * = 2
     * dp[13] = Min{ dp[13-1*1]+1, dp[13-2*2]+1, dp[13-3*3]+1 }
     * = Min{ dp[12]+1, dp[9]+1, dp[4]+1 }
     * = 2
     * dp[n] = Min{ dp[n - i*i] + 1 },  n - i*i >=0 && i >= 1
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (i - j * j >= 0) {
                min = Math.min(dp[i - j * j] + 1, min);
                ++j;
            }
            dp[i] = min;
        }

        return dp[n];
    }


}