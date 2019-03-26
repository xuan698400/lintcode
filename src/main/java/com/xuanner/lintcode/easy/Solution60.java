package com.xuanner.lintcode.easy;

/**
 * 60. 搜索插入位置
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
 * 你可以假设在数组中无重复元素。
 * 样例
 * [1,3,5,6]，5 → 2
 * [1,3,5,6]，2 → 1
 * [1,3,5,6]， 7 → 4
 * [1,3,5,6]，0 → 0
 * 挑战
 * O(log(n)) time
 * 结果
 * 您的提交打败了 70.20% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution60 {

    /**
     * @param A:      an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here

        if (null == A || A.length == 0) {
            return 0;
        }

        int size = A.length;
        for (int i = 0; i < size; i++) {
            if (A[i] >= target) {
                return i;
            }
        }
        //最大的情况
        return size;
    }
}
