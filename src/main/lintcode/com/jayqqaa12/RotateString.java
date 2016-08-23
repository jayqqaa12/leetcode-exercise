package com.jayqqaa12;


/**
 * 给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 *
 */
public class RotateString {


    public void rotateString(char[] str, int offset) {
        if (str.length == 0)   return;


        for (int i = 0; i < offset % str.length; ++i) {
            char tmp = str[str.length - 1];
            for (int j = str.length - 1; j > 0; --j) {
                str[j] = str[j - 1];
            }
            str[0] = tmp;
        }
    }

}
