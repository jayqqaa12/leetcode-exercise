package com.jayqqaa12.string;


/**
 * 交换 元音的 顺序
 * <p>
 * 难度1星
 */
public class Solution345 {

    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (start < end) {

            while (start<end&&!vowels.contains(s.charAt(start)+"")) start++;
            while (start<end&& !vowels.contains(s.charAt(end)+"")) end--;

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);

    }



}

