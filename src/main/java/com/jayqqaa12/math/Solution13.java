package com.jayqqaa12.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 将罗马数字 转化为数字
 * <p>
 * 范围在3999到1
 * <p>
 * 难度1.5星
 */
public class Solution13 {

    /**
     * 根据规则来 如果在 小数在大叔
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        if(s==null||s.length()==0)return 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);


        int temp = map.get(s.charAt(s.length()-1)+"");

        int rst = temp;
        for (int i = s.length()-2; i >=0; i--) {
            int cur =map.get( s.charAt(i)+"");
            if(cur<temp) rst -=cur;
            else rst +=cur;
            temp = cur;
        }


        return rst;
    }
}