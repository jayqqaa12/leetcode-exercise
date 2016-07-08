package com.jayqqaa12.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * 从数组中找出0的 组合 a+b+c =0
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 * 难度 2.5星
 *
 * @REVIEW
 *
 *
 */
public class Solution15 {


    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num); //先排序
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];

                //从头开始找 找到所有  sum 的可能
                //因为是有序的< 就++ 序列

                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }


}