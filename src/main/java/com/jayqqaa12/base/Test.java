package com.jayqqaa12.base;

/**
 * Created by 12 on 2016/7/15.
 */
public class Test {

   public static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }

  public   static int partition(int n[], int left, int right) {
        int mid = n[left];
        while (left < right) {
            while (left < right && n[right] >= mid) right--;
            if (left < right) n[left++] = n[right];

            while (left < right && n[left] <= mid) left++;
            if (left < right) n[right--] = n[left];
        }
        n[left] = mid;
        return left;
    }
}
