package com.jayqqaa12;

public class DeleteDigits {


    public String deleteDigits(String A, int k) {

        if (A == null || A.length() == 0 || k == 0) return A;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < A.length(); j++) {
                if (j == A.length() - 1) {
                    A = A.substring(0, j);
                    break;
                } else if (A.charAt(j) > A.charAt(j + 1)) {
                    A = A.substring(0, j) + A.substring(j + 1);
                    break;
                }
            }
        }

        int i = 0;
        while(i < A.length() && A.charAt(i) == '0') i++;

        return A.substring(i);
    }
}