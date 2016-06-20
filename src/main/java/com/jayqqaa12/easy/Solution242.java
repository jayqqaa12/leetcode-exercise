package com.jayqqaa12.easy;


import java.util.HashMap;
import java.util.Map;

/**
 * 判断 2个 字符串是否由 相同的字符组成
 *
 * 难度 2星
 *
 */
public class Solution242 {


    /**
     * 思路1 不太好
     * 但是适合所有字符串
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {

        if (s == null && t == null) return true;
        if (s.trim().length() == 0 && t.trim().length() == 0) return true;

        s = s.toLowerCase();
        t = t.toLowerCase();
        Map<String, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.get(c + "") == null) map.put(c + "", 1);
            else map.put(c + "", map.get(c + "") + 1);
        }
        Map<String, Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map2.get(c + "") == null) map2.put(c + "", 1);
            else map2.put(c + "", map2.get(c + "") + 1);
        }

        return map.equals(map2);

    }
}