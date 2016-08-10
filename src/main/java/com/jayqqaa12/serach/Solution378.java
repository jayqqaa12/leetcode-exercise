package com.jayqqaa12.serach;

import java.util.PriorityQueue;

/**
 * 从矩阵中找出 第k个最小值
 * <p>
 * 矩阵从上到下 从左到右排序
 * <p>
 * 难度2.5星
 */
public class Solution378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        //优先队列 自动排序
        PriorityQueue<Tuple> pq = new PriorityQueue<>();

        //第一排总是最小的
        for (int j = 0; j <= n - 1; j++) pq.offer(new Tuple(0, j, matrix[0][j]));

        for (int i = 0; i < k - 1; i++) {
            Tuple t = pq.poll();
            if (t.x == n - 1) continue;
            pq.offer(new Tuple(t.x + 1, t.y, matrix[t.x + 1][t.y]));
        }
        return pq.poll().val;
    }

    class Tuple implements Comparable<Tuple> {
        int x, y, val;

        public Tuple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Tuple that) {
            return this.val - that.val;
        }
    }
}