package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 求 1~n 的数组 组成长度为k的数组的所有结果集
 * input n = 4 and k = 2
 * output:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * <p>
 * 难度2星
 */
public class Solution77 {


    public List<List<Integer>> combine(int n, int k) {

        List list = new ArrayList<>();
        dfs(list, new ArrayList(), 1, n, k);
        return list;

    }

    private void dfs(List list, ArrayList subList, int start, int n, int k) {
        if (k == 0) {
            list.add(new ArrayList<>(subList));
            return;
        }
        for (int i = start; i <= n; i++) {
            subList.add(i);
            dfs(list, subList, i + 1, n, k - 1);
            subList.remove(subList.size() - 1);
        }
    }
}