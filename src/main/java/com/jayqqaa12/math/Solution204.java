package com.jayqqaa12.math;


/**
 * 求 n 以内的素数的数量
 */
public class Solution204 {


    /**
     * 可以排除掉  2到logN 的倍数的数字 剩下的都是素数
     * 比较费空间
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {

        int sum = 0;
        boolean[] flag = new boolean[n];

        for (int i = 2; i < n; i++) {

            if (flag[i] == false) {
                sum++;
                for (int j = 2; j < n; j++) {
                    flag[i*j]=true;
                }
            }
        }
        return sum;
    }


    /**
     * 思路1  暴力求解
     * <p>
     * 毫无疑问 超时
     *
     * @param n
     * @return
     */
    public int countPrimes1(int n) {
        if (n <= 2) return 0;

        int sum = 0;

        for (int i = 2; i < n; i++) {

            int div = 2;

            while (div < i) {
                if (i % div == 0) break;
                div++;
            }


            if (div == i) sum++;
        }

        return sum;
    }


}