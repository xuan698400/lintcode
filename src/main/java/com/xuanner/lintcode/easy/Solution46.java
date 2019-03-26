package com.xuanner.lintcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 46. Majority Element
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 * 样例
 * 给出数组[1,1,1,1,2,2,2]，返回 1
 * 挑战
 * 要求时间复杂度为O(n)，空间复杂度为O(1)
 * 结果
 * 您的提交打败了 83.80% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution46 {

    /*
         * @param nums: a list of integers
         * @return: find a  majority number
         */
    public int majorityNumber(List<Integer> nums) {
        // write your code here

        Map<Integer, Integer> map = new HashMap<>();

        int size = nums.size();
        for (int i = 0; i < size; i++) {
            int val = nums.get(i);
            Integer count = map.get(val);
            if (null == count) {
                count = 1;
            } else {
                count++;
            }
            map.put(val, count);
            if (count > (size / 2)) {
                return val;
            }
        }
        return 0;
    }
}
