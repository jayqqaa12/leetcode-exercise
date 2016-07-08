package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;


/**
 * 求 杨辉三角的第 k 行
 *
 * For example, given k = 3,
 * Return [1,3,3,1].
 *
 * 要求O(N)
 *
 *
 *
 * 难度2星
 */
public class Solution119 {


    /**
     * no.118 一样
     *
     * @param k
     * @return
     */
    public List<Integer> getRow(int k) {

        List<Integer> row = new ArrayList<>();
        if(k<0)return row;

        for (int i = 0; i < k; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1)); //key
            }
        }

        return row;

    }
}