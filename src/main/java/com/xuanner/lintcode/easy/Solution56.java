package com.xuanner.lintcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 56. 两数之和
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
 * 样例
 * 给出 numbers = [2, 7, 11, 15], target = 9, 返回 [0, 1].
 * 挑战
 * Either of the following solutions are acceptable:
 * O(n) Space, O(nlogn) Time
 * O(n) Space, O(n) Time
 * 结果
 * 您的提交打败了 83.00% 的提交!
 * Created by xuan on 2018/5/14.
 */
public class Solution56 {

    /**
     * @param numbers: An array of Integer
     * @param target:  target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] result = new int[2];

        Map<Integer, Integer> data2IndexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int secondData = numbers[i];
            int val = target - secondData;
            Integer firstIndex = data2IndexMap.get(val);
            if (null != firstIndex) {
                result[0] = firstIndex;
                result[1] = i;
                return result;
            }
            data2IndexMap.put(secondData, i);
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
