package com.jayqqaa12.bit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 从DNA 序列
 *
 * 找出 10个字母的  所有可能的序列集合
 *
 *
 * 难度2星
 *
 */
public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>(),rst =new HashSet<>();
        for (int i = 0; i+9 < s.length(); i++) {
           String  sub= s.substring(i, i + 10);
            if(!set.add(sub))rst.add(sub);
        }

        return  new ArrayList<>(rst);
        
    }
}