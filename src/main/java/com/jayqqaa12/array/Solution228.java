package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (n != nums[i]) {
                list.add(n + "->" + nums[i]);
            } else {
                list.add(n + "");
            }
        }


        return list;

    }
}