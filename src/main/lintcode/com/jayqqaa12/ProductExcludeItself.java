package com.jayqqaa12;

import java.util.ArrayList;

/**
 * 给定一个整数数组A。
 * 定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。
 */
public class ProductExcludeItself {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        ArrayList<Long> result = new ArrayList<Long>(A.size());
        for (int i = 0; i < A.size(); ++i) {
            result.add(i == 0 ? 1L : result.get(i - 1) * A.get(i - 1));
        }
        long product = 1L;
        for (int i = A.size() - 1; i >= 0; --i) {
            product *= i == A.size() - 1 ? 1 : A.get(i + 1);
            result.set(i, result.get(i) * product);
        }
        return result;
    }
}
