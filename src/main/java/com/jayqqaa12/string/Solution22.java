package com.jayqqaa12.string;

import java.util.ArrayList;
import java.util.List;


/**
 * 求n 对 () 可能的组合
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * 难度3星
 *
 * FIXME
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List list = new ArrayList<>();
        backtarck(list, "", 0, 0, n);
        return list;
    }


    private void backtarck(List list, String s, int open, int close, int max) {

        if (s.length() == 2 * max) {
            list.add(s);
            return;
        }
        if (open < max)
            backtarck(list, s + "(", open + 1, close, max);
        if (close < open)
            backtarck(list, s + ")", open, close + 1, max);


    }

}