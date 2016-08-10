package com.jayqqaa12.dp;

import java.util.List;


/**
 * 给点数组 求从上到下的最短距离每次下移的时候 可以移动到相邻的位置
 * <p>
 * For example, given the following triangle
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * <p>
 * 难度2.5星
 * <p>
 * FIXME
 */
public class Solution120 {


    /**
     * 状态转移方程：
     * S[i][j] = min(S[i+1][j] + S[i+1][j+1]) +S[i][j]
     * S[0][0]就是要求解的答案。
     *
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = triangle.size() - 2; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                triangle.get(i).set(j, triangle.get(i).get(j)
                        + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
        return triangle.get(0).get(0);
    }


}