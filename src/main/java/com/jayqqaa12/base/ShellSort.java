package com.jayqqaa12.base;

/**
 * 希尔排序（分组的插入排序 ）
 * 先将整个待排元素序列分割成若干个子序列（由相隔某个“增量”的元素组成的）
 * 分别进行直接插入排序，然后依次缩减增量再进行排序，
 * 待整个序列中的元素基本有序（增量足够小）时，再对全体元素进行一次直接插入排序。
 * 因为直接插入排序在元素基本有序的情况下（接近最好情况）
 * ，效率是很高的，因此希尔排序在时间效率上比前两种方法有较大提高。
 *
 * 时间 O(N(logN)^2)
 * 空间 O(1)
 *
 * 不稳定
 *
 */
public class ShellSort {

    public static void shellSort(int[] data) {
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i; j >= increment; j -= increment) {
                    if(temp > data[j - increment]){
                        data[j] = data[j - increment];
                    }else{
                        break;
                    }
                }
                data[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = new int[] { 5, 2, 8, 9, 1, 3 ,4};

        System.out.println("未排序前");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }

        shellSort(data);

        System.out.println("\n排序后");
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
    }

}
