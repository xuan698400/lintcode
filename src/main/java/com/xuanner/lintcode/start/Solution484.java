package com.xuanner.lintcode.start;

/**
 * 484. 交换数组两个元素
 * 给你一个数组和两个索引，交换下标为这两个索引的数字
 * 样例
 * 给出 [1,2,3,4] index1 = 2, index2 = 3. 交换之后变成 [1,2,4,3]
 * Created by xuan on 2018/5/14.
 */
public class Solution484 {

    /**
     * @param A:      An integer array
     * @param index1: the first index
     * @param index2: the second index
     * @return: nothing
     */
    public void swapIntegers(int[] A, int index1, int index2) {
        // write your code here

        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
