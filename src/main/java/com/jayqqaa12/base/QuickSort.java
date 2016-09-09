package com.jayqqaa12.base;

/**
 * 快速排序
 * <p>
 * 首先在要排序的序列 a 中选取一个中轴值，而后将序列分成两个部分，其中左边的部分 b 中的元素均小于或者等于 中轴值，
 * 右边的部分 c 的元素 均大于或者等于中轴值，而后通过递归调用快速排序的过程分别对两个部分进行排序，
 * 最后将两部分产生的结果合并即可得到最后的排序序列。
 * “基准值”的选择有很多种方法。最简单的是使用第一个记录的关键字值。但是如果输入的数组是正序或者逆序的，
 * 就会将所有的记录分到“基准值”的一边。较好的方法是随机选取“基准值”，这样可以减少原始输入对排序造成的影响。但是随机选取“基准值”的开销大。
 * 为了实现一次划分，我们可以从数组（假定数据是存在数组中）的两端移动下标，必要时交换记录，
 * 直到数组两端的下标相遇为止。为此，我们附设两个指针（下角标）i 和 j，
 * 通过 j 从当前序列的有段向左扫描，越过不小于基准值的记录。当遇到小于基准值的记录时，扫描停止。
 * 通过 i 从当前序列的左端向右扫描，越过小于基准值的记录。当遇到不小于基准值的记录时，扫描停止。
 * 交换两个方向扫描停止的记录 a[j] 与 a[i]。 然后，继续扫描，直至 i 与 j 相遇为止。扫描和交换的过程结束。
 * 这是 i 左边的记录的关键字值都小于基准值，右边的记录的关键字值都不小于基准值。
 * 通过两个不相邻元素交换，可以一次交换消除多个逆序，加快排序速度。
 * 快速排序方法在要排序的数据已经有序的情况下最不利于发挥其长处。
 * <p>
 * 最好 O(N(LogN)^2)
 * 最坏 O(n^2)
 * 空间  O(N(LogN)^2)
 * 不稳定
 */
public class QuickSort {

    public void quicksort(int n[], int left, int right) {
        if (left < right) {
            int dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }

    public int partition(int n[], int left, int right) {
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
