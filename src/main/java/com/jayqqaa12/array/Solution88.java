package com.jayqqaa12.array;


/**
 * 归并 2个 有序数组 放入num1
 * <p>
 * 难度2星
 */
public class Solution88 {

    public void merge(int[] num1, int m, int[] num2, int n) {

        int length = m + n;


        while (n>0){

            if(m==0|| num1[m-1]<num2[n-1])
                num1[--length]= num2[--n];
            else  num1[--length]=num1[--m];

        }



    }
}