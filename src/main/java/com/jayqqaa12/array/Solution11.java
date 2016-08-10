package com.jayqqaa12.array;


/**
 *
 * 求容器最大面积
 *
 * 难度2星
 */
public class Solution11 {
    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}