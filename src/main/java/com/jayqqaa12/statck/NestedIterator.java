package com.jayqqaa12.statck;

import com.jayqqaa12.NestedInteger;

import java.util.*;


/**
 * 给定一个 有嵌套的list 求iterator
 * <p>
 * 难度1星
 */
public class NestedIterator implements Iterator<Integer> {

    private Queue<Integer> queue = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {

        readList(nestedList);
    }

    private void readList(List<NestedInteger> nestedList) {
        for (NestedInteger n : nestedList) {
            readNum(n);
        }
    }

    private void readNum(NestedInteger n) {

        if (n.isInteger()) queue.add(n.getInteger());
        else readList(n.getList());
    }

    @Override
    public Integer next() {

        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}