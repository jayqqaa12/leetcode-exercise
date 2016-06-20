package com.jayqqaa12.easy;


/**
 * Example: 19 is a happy number
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 *
 * 难度 2星
 *
 *
 * @REVIEW
 *
 */
public class Solution202 {

        public boolean isHappy(int n) {
            int x = n, y = n;

            while (x > 1) {
                x = cal(x);
                if (x == 1) return true;
                y = cal(cal(y));
                if (y == 1) return true;
                if (x == y) return false;
            }

            return true;
        }

        public int cal(int n) {
            int s = 0;
            while (n > 0) {
                s = s+(n % 10) * (n % 10);
                n = n / 10;
            }
            return s;
        }
}