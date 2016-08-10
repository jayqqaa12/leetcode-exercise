package com.jayqqaa12.design;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 实现LRU
 *
 * 难度3星
 *
 * 使用linkedHashMap 自带了lRU
 *
 */
public class LRUCache2 extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache2(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public int get(int key) {
        return getOrDefault(key, -1);
    }

    public void set(int key, int value) {
        put(key, value);
    }
}