package com.jayqqaa12.string;

/**
 *
 * 求2个数字为字符串的 乘法
 *
 * 数字可以 无限大
 * 不能转化为integer
 * 数字非负
 *
 * 难度2.5星
 *
 */
public class Solution43 {
    public String multiply(String num1, String num2) {

        int n1_len =num1.length() ,n2_len=num2.length();
        int []pos = new int[n1_len+n2_len];

        for (int i = n1_len-1; i >=0; i--) {
            for (int j = n2_len-1; j >=0; j--) {

                int mul= (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1=i+j,p2=i+j+1;  //关键
                int sum =mul + pos[p2];

                pos[p1]+=sum/10;
                pos[p2]=sum%10;
            }
        }

        StringBuffer sb =new StringBuffer();
        for(int n:pos) if(!(sb.length()==0&&n==0))sb.append(n);
        return  sb.length()==0?"0":sb.toString();
    }
}