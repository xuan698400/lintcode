package com.xuanner.lintcode.start;

/**
 * 463. 整数排序
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 * 样例
 * 对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。
 * Created by xuan on 2018/5/14.
 */
public class Solution463 {

    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here

        if (null == A || A.length == 1) {
            return;
        }

        int aSize = A.length;

        for (int i = 0; i < aSize - 1; i++) {
            for (int j = 0; j < aSize - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
}
