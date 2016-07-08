package com.jayqqaa12.base;

/**
 * 工作原理：

 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列

 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置

 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置

 4、重复步骤3直到某一指针达到序列尾

 5、将另一序列剩下的所有元素直接复制到合并序列尾
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};

        mergeSort(data, 0, data.length - 1);
    }


    public static void mergeSort(int[] data, int left, int right) {
        if (left >= right)
            return;
        // 找出中间索引  
        int center = (left + right) / 2;
        // 对左边数组进行递归  
        mergeSort(data, left, center);
        // 对右边数组进行递归  
        mergeSort(data, center + 1, right);
        // 合并  
        merge(data, left, center, right);
    }

    /**
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
     *
     * @param data   数组对象
     * @param left   左数组的第一个元素的索引
     * @param center 左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right  右数组最后一个元素的索引
     */
    public static void merge(int[] data, int left, int center, int right) {
        // 临时数组  
        int[] tmpArr = new int[data.length];
        // 右数组第一个元素索引  
        int mid = center + 1;
        //  third记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引  
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组  
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）  
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中  
        // （原left-right范围的内容被复制回原数组）  
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }



}  