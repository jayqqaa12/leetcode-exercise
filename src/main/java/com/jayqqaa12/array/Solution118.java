package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定 n
 * 生成 杨辉三角
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p>
 * 难度2星
 */
public class Solution118 {

    public List<List<Integer>> generate(int n) {

        List list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1)); //key
            }
            list.add(new ArrayList<>(row));
        }

        return list;
    }
}