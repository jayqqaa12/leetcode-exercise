package com.jayqqaa12;


/**
 * 给出两个32位的整数N和M，以及两个二进制位的位置i和j。
 * 写一个方法来使得N中的第i到j位等于M（M会是N中从第i为开始到第j位的子串）
 *
 * 给出N = (10000000000)2，M = (10101)2， i = 2, j = 6
 * 返回 N = (10001010100)2
 *
 *
 */
public class UpdateBits {

    /**
     * @param n, m: Two integer
     * @param i, j: Two bit positions
     *           return: An integer
     */
    public int updateBits(int n, int m, int i, int j) {
        int left = n & ((1 << i) - 1);
        int right = j >= 31 ? 0 : (n >> (j + 1) << (j + 1));
        return left | (m << i) | right;
    }

}