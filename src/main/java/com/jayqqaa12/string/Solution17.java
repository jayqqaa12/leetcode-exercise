package com.jayqqaa12.string;


import java.util.ArrayList;
import java.util.List;


/**
 * 返回电话号码上可能出现的字母组合 比如 2表示 abc  3表示def
 * <p>
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class Solution17 {
       public List<String> letterCombinations(String digits) {

        List list = new ArrayList<>();

        if (digits == null || digits.trim().length() == 0) return list;

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combin(digits, list, "", 0, mapping);

        return list;
    }


    private void combin(String digits, List list, String str, int start, String[] mapping) {

        if (str.length() == digits.length()) {
            list.add(str);
            return;
        }

        String leeter =mapping[digits.charAt(start)-'0'];
        for (int i = 0; i < leeter.length(); i++) {
            combin(digits,list,str+ leeter.charAt(i),start+1,mapping);
        }


    }


}