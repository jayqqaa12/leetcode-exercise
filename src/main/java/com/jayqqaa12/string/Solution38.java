package com.jayqqaa12.string;


/**
 * 题意是n=1时输出字符串1；n=2时，数上次字符串中的数值个数，因为上次字符串有1个1，所以输出11；n=3时，由于上次字符是11，
 * 有2个1，所以输出21；n=4时，由于上次字符串是21，有1个2和1个1，所以输出1211。依次类推，写个countAndSay(n)函数返回字符串。
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * 难度2星
 */
public class Solution38 {


    public String countAndSay(int n) {
        String curr = "1";
        String prev;
        int count;
        char say;
        for (int i = 1; i < n; i++) {
            prev = curr;
            curr = "";
            count = 1;
            say = prev.charAt(0);
            for (int j = 1, len = prev.length(); j < len; j++) {
                if (prev.charAt(j) != say) {
                    curr = curr+count + say;
                    count = 1;
                    say = prev.charAt(j);
                } else count++;
            }
            curr = curr+count + say;
        }
        return curr;
    }
}