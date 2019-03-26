package com.xuanner.lintcode.easy;

/**
 * 407. 加一
 * 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。
 * 该数字按照数位高低进行排列，最高位的数在列表的最前面。
 * 样例
 * 给定 [1,2,3] 表示 123, 返回 [1,2,4].
 * 给定 [9,9,9] 表示 999, 返回 [1,0,0,0].
 * 结果
 * 您的提交打败了 80.20% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution407 {

    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here

        if (null == digits || digits.length == 0) {
            return digits;
        }

        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        //需要扩容数组
        int[] newDigits = new int[size + 1];
        newDigits[0] = 1;
        for (int i = 0; i < size; i++) {
            newDigits[i + 1] = digits[i];
        }
        return newDigits;
    }
}
