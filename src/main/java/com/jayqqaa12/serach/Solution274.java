package com.jayqqaa12.serach;


import java.util.Arrays;

/**
 * 求出文章索引的H-index值。对于h-index，意思是某个学者有n篇文章，
 * 找出最大的h，使得该作者有h篇文章，并且这h篇文章的引用次数大于等于h。
 * <p>
 * <p>
 * <p>
 * 难度2星
 */
public class Solution274 {

    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) {
                return citations.length - i;
            }
        }
        return 0;
    }
}