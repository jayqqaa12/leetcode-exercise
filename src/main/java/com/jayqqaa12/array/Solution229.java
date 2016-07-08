package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;


/**
 * 找出所有出现频率 高于 1/3 的数字
 * <p>
 * 要求 空间为 O（1）
 * <p>
 * FIXME
 */
public class Solution229 {

    /**
     * 跟 no.169 一样
     * <p>
     * 大于 1/3 的数字最多只能有2个
     *
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {

        List list = new ArrayList<>();

        if(nums==null ||nums.length==0)return  list;
        int c1 = 0, c2 = 0, num1 = nums[0], num2 = nums[0];

        // 先找出 最多的2个数
        for (int i = 0; i < nums.length; i++) {

            if (num1 == nums[i]) c1++;
            else if (num2 == nums[i]) c2++;
            else if (c1 == 0) {
                c1 = 1;
                num1 = nums[i];
            } else if (c2 == 0) {
                c2 = 1;
                num2 = nums[i];
            } else {
                c1--;
                c2--;
            }
        }

        //再统计一下 数量

        c1 = 0;
        c2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (num1 == nums[i]) c1++;
            if (num2 == nums[i]) c2++;
        }
        if (c1 > nums.length / 3) list.add(num1);
        if (c2 > nums.length / 3&&num1!=num2) list.add(num2);

        return list;
    }

    /**
     *
     * 求 gray code
     *
     * 难度 2星
     *
     * @REVIEW
     *
     */
    public static class Solution89 {

        /**
         *
         * 根据公式来
         *
         *  G(i) = i^ (i/2).
         * @param n
         * @return
         */
        public List<Integer> grayCode(int n) {

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 1 <<n; i++) {
                list.add(i^i /2);
            }



            return list;
        }
    }

    /**
     *
     * 需要n步 到山顶 每次 可以走 1or2步
     * 有多少种不同的方法
     *
     *  fibonacci sequence
     *
     *  难度 1.5星
     */
    public static class Solution70 {
        public int climbStairs(int n) {

            if(n<=0)return  0;
            if(n==1)return 1;

            int[] store = new int[n];

            store[0]=1;
            store[1]=2;

            for(int i=2;i<n;i++)
                store[i]=store[i-1]+store[i-2];


            return store[n-1];

        }

    }
}