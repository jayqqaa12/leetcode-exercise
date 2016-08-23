package com.jayqqaa12;

/**
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 *
 */
class DigitCounts {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
      int sum = 0;
          char kk = (char)('0' + k);
         for (int i=0; i<=n; i++) {
              String ii = Integer.toString(i);
              for (int j=0; j<ii.length(); j++) {
                  if (ii.charAt(j) == kk) sum++;
              }
          }
          return sum;
    }


    public int digitCounts2(int k, int n) {
        // write your code here
        int result = 0;
        int base = 1;
        while (n/base > 0) {
            int cur = (n/base)%10;
            int low = n - (n/base) * base;
            int high = n/(base * 10);

            if (cur == k) {
                result += high * base + low + 1;
            } else if (cur < k) {
                result += high * base;
            } else {
                result += (high + 1) * base;
            }
            base *= 10;
        }
        return result;
    }
};
