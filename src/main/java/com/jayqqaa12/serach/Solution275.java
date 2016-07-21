package com.jayqqaa12.serach;


/**
 * 跟 274 一样 只不过这次已经排序了
 *
 * 难度1星
 *
 */
public class Solution275 {
    public int hIndex(int[] citations) {
        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) {
                return citations.length - i;
            }
        }
        return 0;
    }
}