package com.jayqqaa12.other;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回所有回文的子串
 * <p>
 * 难度2星
 */
public class Solution131 {
    List<List<String>> resultLst;
    ArrayList<String> currLst;

    public List<List<String>> partition(String s) {
        resultLst = new ArrayList<>();
        currLst = new ArrayList<>();
        backTrack(s, 0);
        return resultLst;
    }

    public void backTrack(String s, int l) {
        if (currLst.size() > 0 && l >= s.length()) {
            resultLst.add(new ArrayList<>(currLst));
        }

        for (int i = l; i < s.length(); i++) {
            if (isPalindrome(s, l, i)) {

                if (l == i) currLst.add(s.charAt(i) + "");
                else currLst.add(s.substring(l, i + 1));

                backTrack(s, i + 1);
                currLst.remove(currLst.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str, int l, int r) {
        if (l == r) return true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}