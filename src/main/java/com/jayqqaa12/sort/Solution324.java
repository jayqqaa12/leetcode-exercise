package com.jayqqaa12.sort;


import java.util.ArrayList;
import java.util.List;

/**
 * 重排序 使
 * <p>
 * nums[0] < nums[1] > nums[2] < nums[3] ...
 * Example:
 * (1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
 * (2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].
 * <p>
 * 难度3星
 */
public class Solution324 {
    public void wiggleSort(int[] nums) {
        int median = selectKth(nums, 0, nums.length - 1, nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1);
        List<Integer> leftArr = new ArrayList<>();
        for (int i = 0; i <= median; i++)
            leftArr.add(nums[i]);
        List<Integer> rightArr = new ArrayList<>();
        for (int i = median + 1; i < nums.length; i++)
            rightArr.add(nums[i]);
        for (int li = leftArr.size() - 1, ri = rightArr.size() - 1, i = 0; ri >= 0; li--, ri--, i += 2) { // right is same or shorter than left
            nums[i] = leftArr.get(li);
            nums[i + 1] = rightArr.get(ri);
        }
        if (nums.length % 2 != 0)
            nums[nums.length - 1] = leftArr.get(0);
    }

    private int selectKth(int[] nums, int start, int end, int k) {
        int[] res = partition(nums, start, end);
        int lb = res[0];
        int hb = res[1];
        if (k - 1 < lb)
            return selectKth(nums, start, lb - 1, k);
        else if (k - 1 > hb)
            return selectKth(nums, hb + 1, end, k);
        else
            return k - 1;
    }

    private int[] partition(int[] nums, int lb, int hb) {
        int pVal = nums[lb]; // use random genarater is better in performance
        int i = lb;
        while (i <= hb) {
            if (nums[i] == pVal)
                i++;
            else if (nums[i] < pVal)
                swap(nums, i++, lb++);
            else
                swap(nums, i, hb--);
        }
        int[] res = new int[2];
        res[0] = lb;
        res[1] = hb;
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}