package com.jayqqaa12.array;


/**
 * 从数组nums 找出和 >=s的 最小长度的子集的长度
 * <p>
 * 没有返回0
 */
public class Solution209 {


    /**
     * O(n)
     *
     * 因为求的是子集
     * 所以从小往上加就行了
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {


        int min = Integer.MAX_VALUE;
        int sum = 0;

        int start = 0 ,i = 0 ;

        while (start <  nums.length) {
            sum += nums[start++];
            while (sum >= target) {
                min = Math.min(min, start-i);
                sum -= nums[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}