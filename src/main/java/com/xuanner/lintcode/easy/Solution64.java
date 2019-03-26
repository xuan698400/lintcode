package com.xuanner.lintcode.easy;

/**
 * 64. 合并排序数组
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * 样例
 * 给出 A = [1, 2, 3, empty, empty], B = [4, 5]
 * 合并之后 A 将变成 [1,2,3,4,5]
 * 结果
 * 您的提交打败了 81.20% 的提交!
 * Created by xuan on 2018/5/14.
 */
public class Solution64 {

    /*
         * @param A: sorted integer array A which has m elements, but size of A is m+n
         * @param m: An integer
         * @param B: sorted integer array B which has n elements
         * @param n: An integer
         * @return: nothing
         */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here

        if (n == 0) {
            return;
        }

        int ai = m - 1;
        int bi = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (ai > -1 && A[ai] > B[bi]) {
                A[i] = A[ai];
                ai--;
            } else {
                A[i] = B[bi];
                bi--;
            }
            if (bi == -1) {
                break;
            }
        }
    }
}
