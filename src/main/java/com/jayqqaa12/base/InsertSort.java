package com.jayqqaa12.base;

/**
 * 插入排序
 *
 * 思路 默认第一个有序
 * 每次插入一个数 调整位置
 *
 * O(n2)
 */
public class InsertSort {


    public  void insertSort() {

        int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int  temp = a[i];
            for (; j >= 0 && temp > a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;

        }

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

    }


}
