package com.jayqqaa12.math;

/**
 * 求 未交集的面积
 * <p>
 * 难度1。5星
 */
public class Solution223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {


        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);

        int h = right > left ? right - left : 0;
        int w = top > bottom ? top - bottom : 0;

        return (C - A) * (D - B) + (G - E) * (H - F) - h*w;

    }
}