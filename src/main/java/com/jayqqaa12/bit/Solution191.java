package com.jayqqaa12.bit;


/**
 * 求n 二进制1的个数
 *
     * 原理 n& (n-1)
 *
 * 难度 1星
 *
 * 类库实现 Integer.bitCount(n)
 *
 */
public class Solution191 {

        public int hammingWeight(int n) {
            int count = 0;

            while (n!=0){
                n= n & (n-1);
                count++;
            }

            return count;
        }



    }