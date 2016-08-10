package com.jayqqaa12.other;

import java.util.Set;

/**
 * 求给定字符串 s 能否分解为字典  dict
 *
 * 难度2星
 *
 */
public class Solution139 {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        // DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];

    }
}