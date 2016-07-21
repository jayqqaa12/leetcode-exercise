package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回给定数组中 所有组的不同组合(数组数字 都不相同)
 * <p>
 * For example,
 * input 1,2,3
 * <p>
 * [[1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]]
 * <p>
 * 难度 2星
 */
public class Solution46 {

    /**
     * dfs 方式最优解
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {

        List list = new ArrayList<>();
        dfs(list, new ArrayList(), nums, 0);

        return list;
    }

    private void dfs(List list, ArrayList subList, int[] nums, int start) {

        if (start == nums.length) {
            list.add(new ArrayList<>(subList));
            return;
        }
        for (int i = 0; i <= start; i++) {
            subList.add(i, nums[start]);
            dfs(list, subList, nums, 1 + start);
            subList.remove(i);
        }

    }


}