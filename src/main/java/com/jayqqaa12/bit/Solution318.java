package com.jayqqaa12.bit;


/**
 * 求数组中 2个由不同 字母组成的 字符串的最大乘鸡
 * <p>
 * 难度2星        public class Solution201 {
 public int rangeBitwiseAnd(int m, int n) {

 }
 }
 */
public class Solution318 {



    public int maxProduct(String[] words) {
        int max = 0;
        int[] bytes = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int val = 0;
            for (int j = 0; j < words[i].length(); j++) {
                val |= 1 << (words[i].charAt(j) - 'a');     //key
            }
            bytes[i] = val;
        }
        for (int i = 0; i < bytes.length; i++) {
            for (int j = i + 1; j < bytes.length; j++) {
                // 如果 & ==0 所以没有相同字母
                if ((bytes[i] & bytes[j]) == 0) max = Math.max(max, words[i].length() * words[j].length());
            }
        }
        return max;
    }
}