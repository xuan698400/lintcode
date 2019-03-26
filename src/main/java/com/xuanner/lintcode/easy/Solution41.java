package com.xuanner.lintcode.easy;

/**
 * 41. 最大子数组
 * 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。
 * 样例
 * 给出数组[−2,2,−3,4,−1,2,1,−5,3]，符合要求的子数组为[4,−1,2,1]，其最大和为6
 * 挑战
 * 要求时间复杂度为O(n)
 * 结果
 * 您的提交打败了 48.60% 的提交!
 * Created by xuan on 2018/5/15.
 */
public class Solution41 {

    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here

        //贪心算法
        int sum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
