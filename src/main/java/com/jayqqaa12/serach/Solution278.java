package com.jayqqaa12.serach;

import com.jayqqaa12.VersionControl;


/**
 * 找到第一个bad version
 *
 * 难度1星
 *
 */
public class Solution278 extends VersionControl {

    public int firstBadVersion(int n) {
        int left=1,right=n;

        while(left<right){
            int mid = left +(right-left)/2;
            boolean rst = isBadVersion(mid);
            if(!rst )left = mid+1;
            else   right=mid;

        }

        return  left;
    }
}