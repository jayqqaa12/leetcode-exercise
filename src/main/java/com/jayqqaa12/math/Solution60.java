package com.jayqqaa12.math;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * 列出n 的所有排序 中个第 K个
 *
 *
 *
 *
 * 难度2星
 */
public class Solution60 {


    /**
     * 1）第k个排列的第一个元素在0-n中的位置为（k-1）/（n-1）！
     2）在剩下的元素中继续找第一个；
     3）依此类推；
     *
     * @param n
     * @param k
     * @return
     */
    public String getPermutation(int n, int k) {

        List<Integer> num = new LinkedList<>();
        for (int i = 1; i <= n; i++) num.add(i);
        int[] fact = new int[n];  // factorial
        fact[0] = 1;
        for (int i = 1; i < n; i++) fact[i] = i*fact[i-1];
        k = k-1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--){
            int ind = k/fact[i-1];
            k = k%fact[i-1];
            sb.append(num.get(ind));
            num.remove(ind);
        }
        return sb.toString();
    }





}