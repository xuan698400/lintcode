package com.xuanner.lintcode.start;

/**
 * 763. Hex Conversion
 * Given a decimal number n and an integer k, Convert decimal number n to base-k.
 * 样例
 * Example 1:
 * Given n = 5, k = 2
 * return "101"
 * Example 2:
 * Given n = 30, k = 16
 * return "1E"
 * Created by xuan on 2018/5/14.
 */
public class Solution763 {

    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
        // write your code here

        int temp = n;

        if (temp == 0) {
            return "0";
        }

        String str = "";
        while (temp > 0) {
            int yu = temp % k;
            temp = temp / k;
            str = getString(yu) + str;
        }
        return str;
    }

    private String getString(int n) {
        if (n == 10) {
            return "A";
        }
        if (n == 11) {
            return "B";
        }
        if (n == 12) {
            return "C";
        }
        if (n == 13) {
            return "D";
        }
        if (n == 14) {
            return "E";
        }
        if (n == 15) {
            return "F";
        }
        return "" + n;
    }
}
