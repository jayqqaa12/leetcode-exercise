package com.jayqqaa12.string;


/**
 * 2个二进制 字符串
 * 相加
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 * <p>
 * 难度2星
 *
 * FIXME
 */
public class Solution67 {



    /**
     * 从高位相加
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {

        int c=0;
        StringBuffer sb = new StringBuffer();
        for (int i = a.length()-1, j = b.length()-1 ; i>=0|| j>=0 ;j--,i--) {

            if(i>=0) c+= a.charAt(i)-'0';
            if(j>=0) c+= b.charAt(j)-'0';

            sb.insert(0, (char) (c%2+'0' ));
            c/=2;
        }
        if(c==1 )sb.insert(0,"1");

        return  sb.toString();
    }





}