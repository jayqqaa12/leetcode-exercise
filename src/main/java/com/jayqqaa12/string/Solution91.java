package com.jayqqaa12.string;


/**
 * 编码方式如下
 * 'A' -> 1
 * 'B' -> 2
 * 'Z' -> 26
 * <p>
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * <p>
 * 找出给定的字符串 可能有几种解码方式
 */
public class Solution91 {


    /**
     * DP
     * dp(n)=dp(n-1)+dp(n-2)
     *
     * @param s
     * @return
     */
    public int numDecodings(String s) {

        int len = s.length();
        if(len==0)return len;

        int[] nums =new int[len+1];
        nums[len]=1;
        nums[len-1]=s.charAt(len-1)!='0'?1:0;

        for (int i = len-2; i >=0 ; i--) {

            if(s.charAt(i)=='0')continue;
            nums[i]=  Integer.parseInt(s.substring(i,i+2))<=26 ? nums[i+1]+nums[i+2]:nums[i+1];

        }

        return  nums[0];
    }
}