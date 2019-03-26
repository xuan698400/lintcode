package com.xuanner.lintcode.easy;

/**
 * 14. 二分查找
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 * 样例
 * 在数组 [1, 2, 3, 3, 4, 5, 10] 中二分查找3，返回2。
 * 挑战
 * 如果数组中的整数个数超过了2^32，你的算法是否会出错？
 * Created by xuan on 2018/5/14.
 */
public class Solution14 {

    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int low = 0;
        int hight = nums.length - 1;
        return search(nums, target, low, hight);
    }

    private int search(int[] nums, int target, int low, int hight) {
        if (target < nums[low] || target > nums[hight] || low > hight) {
            return -1;
        }

        int mid = (low + hight) / 2;
        if (target < nums[mid]) {
            return search(nums, target, low, mid - 1);
        } else if (target > nums[mid]) {
            return search(nums, target, mid + 1, hight);
        } else {
            //相等的情况特殊处理一下
            while (mid > 0) {
                if (target == nums[mid - 1]) {
                    mid--;
                } else {
                    return mid;
                }
            }
            return 0;
        }
    }
}
