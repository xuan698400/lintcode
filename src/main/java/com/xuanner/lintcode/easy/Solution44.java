package com.xuanner.lintcode.easy;

import java.util.HashMap;
import java.util.List;

/**
 * 44. 最小子数组
 * 给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。
 * 样例
 * 给出数组[1, -1, -2, 1]，返回 -3
 * 结果
 * 您的提交打败了 99.20% 的提交!
 * Created by xuan on 2018/5/15.
 */
public class Solution44 {

    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here

        //贪心算法
        int min = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;

        int n = nums.size();
        for (int i = 0; i < n; i++) {
            if (sum > 0) {
                sum = nums.get(i);
            } else {
                sum += nums.get(i);
            }

            if (sum < min) {
                min = sum;
            }
        }

        return min;
    }

}
