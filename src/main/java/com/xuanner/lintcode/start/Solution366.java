package com.xuanner.lintcode.start;

/**
 * 366. 斐波纳契数列
 * 查找斐波纳契数列中第 N 个数。
 * 所谓的斐波纳契数列是指：
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * 样例
 * 给定 1，返回 0
 * 给定 2，返回 1
 * 给定 10，返回 34
 * Created by xuan on 2018/5/14.
 */
public class Solution366 {

    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int v = 0;
        for (int i = 3; i <= n; i++) {
            v = a + b;
            a = b;
            b = v;
        }
        return v;
    }
}
