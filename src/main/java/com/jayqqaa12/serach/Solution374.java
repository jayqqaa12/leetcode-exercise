package com.jayqqaa12.serach;


import com.jayqqaa12.GuessGame;

/**
 * 猜数字
 * <p>
 * 高了返回1 低了返回 -1 正好 返回0
 * <p>
 * <p>
 * 难度1星
 */
public class Solution374 extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n)==0)return n;

        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int t = guess(mid);
            if (t== 0) return mid;
            if (t == 1) left = mid;
            else right = mid;

        }
        return left;
    }
}