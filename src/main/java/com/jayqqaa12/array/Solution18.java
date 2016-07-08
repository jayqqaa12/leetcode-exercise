package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 从数组中找到 所有
 * a + b + c + d = target的集合
 * <p>
 * 难度3星
 */
public class Solution18 {


    /**
     *  no.15
     *  3sum 改一下
     *
     *
     * @param num
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length - 3; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;
            for (int j = i + 1; j < num.length - 2; j++) {

                if (j > i + 1 && num[j] == num[j - 1]) continue;

                int low = j + 1, high = num.length - 1;
                while (low < high) {
                    int sum = num[i] + num[j] + num[low] + num[high];
                    if (sum == target) {
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while (low < high && num[low] == num[low + 1]) low++;
                        while (low < high && num[high] == num[high - 1]) high--;
                        low++;
                        high--;
                    } else if (sum < target) low++;
                    else high--;
                }
            }
        }
        return ans;
    }

}