package com.jayqqaa12.math;


/**
 *
 * 求 能否用 x,y 升的容器 测量 z升水
 *
 * 难度2.5星
 *
 */
public class Solution365 {

    /**
     * 数学问题
     * @param x
     * @param y
     * @param z
     * @return
     */
    public boolean canMeasureWater(int x, int y, int z) {
        if(x + y < z) return false;
        if( x == z || y == z || x + y == z ) return true;
        return z% GCD(x, y) == 0;     //求是否z 是其倍数
    }


    /**
     * 求最大公约数
     * @param a
     * @param b
     * @return
     */
    public int GCD(int a, int b){
        while(b != 0 ){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}