package com.jayqqaa12.string;

import java.util.*;

/**
 * 给字符串 分组 （组成字母相同的为同组）
 *
 * 难度1星
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        List list = new ArrayList<>();

        Map<String,List<String>> map =new HashMap<>();

        for(String str:strs){
            String pre = sort(str);
            if(map.get(pre)==null){
                map.put(pre, new ArrayList<>());
            }
            map.get(pre).add(str);
        }

        list.addAll(map.values());

        return list;
    }

    private String sort(String pre) {

        char[] temp = pre.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}