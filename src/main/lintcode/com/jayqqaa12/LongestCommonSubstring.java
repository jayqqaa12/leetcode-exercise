package com.jayqqaa12;

public class LongestCommonSubstring {


    public static String getMaxString(String str1, String str2) {
        String max = null;
        String min = null;
        max = (str1.length() > str2.length() ? str1 : str2);
        min = max.equals(str1) ? str2 : str1;
        for (int i = 0; i < min.length(); i++) {
            for (int start = 0, end = min.length() - i; end != min.length() + 1; start++, end++) {
                String sub = min.substring(start, end);
                if (max.contains(sub))
                    return sub;
            }
        }
        return null;
    }
}