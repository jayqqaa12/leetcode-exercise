package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有 数量为 k 的数使和为 n (数字为1到9之间)
 * Input: k = 3, n = 9
 * Output:
 * [[1,2,6], [1,3,5], [2,3,4]]
 *
 * 难度 2星
 */
public class Solution216 {


    public List<List<Integer>> combinationSum3(int k, int n) {

        List list = new ArrayList<>();

        dfs(list, new ArrayList(), n, k, 1);

        return list;

    }

    private void dfs(List list, ArrayList subList, int n, int k, int start) {

        if (n == 0 && k == subList.size()) {
            list.add(new ArrayList<>(subList));
            return;
        }

        for (int i = start; i <= 9; i++) {
            subList.add(i);
            dfs(list, subList, n - i, k, start + 1);
            subList.remove(subList.size() - 1);
        }


    }


}