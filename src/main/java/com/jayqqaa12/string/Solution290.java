package com.jayqqaa12.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 判断 str 是否匹配 pattern
 * <p>
 * 都只包含小写字母
 * <p>
 * <p>
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 *
 * 难度2星
 *
 * FIXME
 */
public class Solution290 {


    public boolean wordPattern(String pattern, String str) {

        String[] strArry = str.split(" ");
        if(strArry.length!=pattern.length())return false;


        Map map = new HashMap<>();
        for (Integer i = 0; i < strArry.length; i++) {
            if(map.put(pattern.charAt(i),i)!= map.put(strArry[i],i))
                return false;

        }
        return true;
    }



}