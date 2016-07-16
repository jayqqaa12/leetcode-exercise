package com.jayqqaa12.bit;


/**
 * 给一个范围，返回这个范围中
 *
 * 所有的数按位 相与  的结果。
 *
 *
 * 难度2星
 *
 */
public class Solution201 {


    /**
     * 当m!=n，那么最末位必定等0，因为[m, n]必定包含奇偶数，相与最末位等0。
     * 可以将m，n都右移一位，记为mk、 nk，这样就相当于将[m, n]之间的所有的数都右移动了一位，
     * 当mk=nk的时候，说明之前[m, n]之间的数右移一位后是相等的，右移后的数作AND操作，
     * 结果还是m(=n)，所以操作就可以停止了记录右移的次数，offset，m>>offset即为所求结果
     *
     * @param m
     * @param n
     * @return
     */
    public int rangeBitwiseAnd(int m, int n) {
        int bit =0;
        while(m!=n){
            m>>=1;
            n>>=1;
            bit++;
        }

        return  m<<bit;
    }
}