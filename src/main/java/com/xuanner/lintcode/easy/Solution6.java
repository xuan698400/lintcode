package com.xuanner.lintcode.easy;

/**
 * 6. 合并排序数组 II
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * 样例
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 * 挑战
 * 你能否优化你的算法，如果其中一个数组很大而另一个数组很小？
 * Created by xuan on 2018/5/14.
 */
public class Solution6 {

    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        int aSize = A.length;
        int bSize = B.length;
        int abSize = aSize + bSize;

        int[] AB = new int[abSize];
        int ai = 0;
        int bi = 0;

        for (int i = 0; i < abSize; i++) {
            if (ai == aSize) {
                AB[i] = B[bi];
                bi++;
                continue;
            }

            if (bi == bSize) {
                AB[i] = A[ai];
                ai++;
                continue;
            }

            if (A[ai] < B[bi]) {
                AB[i] = A[ai];
                ai++;
                continue;
            } else {
                AB[i] = B[bi];
                bi++;
                continue;
            }
        }
        return AB;
    }
}
