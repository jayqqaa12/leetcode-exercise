package com.jayqqaa12.easy;


import java.util.HashMap;
import java.util.Map;

/**
 * 判断2个字符串结构是否相同
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * <p>
 * <p>
 * 难度1.5星
 */
public class Solution205 {


    /**
     * 思路 建立对应关系
     *
     * 然后判断就可以了
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (!map.get(a).equals(b)) return false;
            } else {
                if (!map.containsValue(b)) map.put(a, b);
                else return false;
            }

        }

        return true;


    }


}