package com.jayqqaa12;

import java.util.LinkedList;
import java.util.List;

public class ReversePairs {

    /**
     * @param A an array
     * @return total of reverse pairs
     */
    // TLE
    // O(nlg(n)) time, O(n) space.
    public long reversePairs2(int[] A) {
        long result = 0;
        List<Integer> list = new LinkedList<Integer>();
        for (int i = A.length - 1; i >= 0; --i) {
            int low = 0;
            int high = list.size();
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (A[i] > list.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            list.add(high, A[i]);
            result += high;
        }
        return result;
    }

/*********************************************************/

    public long reversePairs(int[] A) {
        // Write your code here
        long result = 0;
        for (int i = 0; i < A.length; ++i) {
            for (int j = i + 1; j < A.length; ++j) {
                if (A[i] > A[j]) {
                    result++;
                }
            }
        }
        return result;
    }

}