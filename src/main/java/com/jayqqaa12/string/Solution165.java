package com.jayqqaa12.string;


import java.util.DoubleSummaryStatistics;

/**
 * 比较版本号
 * <p>
 * <p>
 * 难度 1.5星
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {

        if (version1.equals(version2)) return 0;


        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int len = Math.max(v1.length,v2.length);

        for (int i = 0; i < len; i++) {

            Integer vn1= i<v1.length?Integer.parseInt(v1[i]):0;
            Integer vn2= i<v2.length?Integer.parseInt(v2[i]):0;

            int rst = vn1.compareTo(vn2);
            if(rst!=0)return rst;
        }

        return  0;

    }



}