package com.jayqqaa12.design;


import java.util.ArrayList;
import java.util.List;


/**
 * 实现这个数据结构 minStack
 *
 * 难度1星
 *
 */
public class MinStack {

    List<Integer> list = new ArrayList<>();
    private int min=Integer.MAX_VALUE;

    public void push(int x) {
        list.add(x);
        min = Math.min(min, x);
    }

    public void pop() {
        if (!list.isEmpty()) {
            int rst = list.remove(list.size() - 1);
            reBuild(rst);
        }

    }

    private void reBuild(int n) {
        if (n == min) {
            min = Integer.MAX_VALUE;
            for (int num : list)
                min = Math.min(min, num);
        }
    }

    public int top() {
        if (list.isEmpty()) return 0;
        int rst = list.get(list.size() - 1);
        return rst;
    }

    public int getMin() {
        return min;
    }
}
