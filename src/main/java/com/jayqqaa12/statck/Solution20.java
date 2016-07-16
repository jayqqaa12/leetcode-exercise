package com.jayqqaa12.statck;


import java.util.Stack;

/**
 *
 * 字符串 为 () [] ｛｝
 *
 * 判断括号是否正确关闭    ({(}
 *
 */
public class Solution20 {

    /**
     * 用stack 判断一下
     *
     * @param str
     * @return
     */
    public boolean isValid(String str) {


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(c==']'&&!stack.isEmpty()&&stack.peek()=='[')
                stack.pop();
            else if(c==')'&&!stack.isEmpty()&&stack.peek()=='(')
                stack.pop();
            else if(c=='}'&&!stack.isEmpty()&&stack.peek()=='{')
                stack.pop();
            else return false;
        }

        return  stack.isEmpty();

    }
}