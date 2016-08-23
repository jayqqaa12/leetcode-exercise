package com.jayqqaa12.base;

/**
 * Created by 12 on 2016/7/4.
 *
 *二分搜索
 *
 */
public class BinarySerach {

    public static int binarySearch(int []srcArray,int des){
        //第一个位置.
        int low=0;
        //最高位置.数组长度-1,因为下标是从0开始的.
        int high=srcArray.length-1;
        //当low"指针"和high不重复的时候.
        while(low<=high){

            int middle=low+(high-low)/2;
            //与最中间的数字进行判断,是否相等,相等的话就返回对应的数组下标.
            if(des==srcArray[middle]){
                return middle;
                //如果小于的话则移动最高层的"指针"
            }else if(des<srcArray[middle]){
                high=middle-1;
                //移动最低的"指针"
            }else{
                low=middle+1;
            }
        }
        return-1;
    }
}
