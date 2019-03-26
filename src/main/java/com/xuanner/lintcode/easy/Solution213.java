package com.xuanner.lintcode.easy;

/**
 * 设计一种方法，通过给重复字符计数来进行基本的字符串压缩。
 * 例如，字符串 aabcccccaaa 可压缩为 a2b1c5a3 。而如果压缩后的字符数不小于原始的字符数，则返回原始的字符串。
 * 可以假设字符串仅包括a-z的字母。
 * 样例
 * str=aabcccccaaa 返回 a2b1c5a3
 * str=aabbcc 返回 aabbcc
 * str=aaaa 返回 a4
 * 结果
 * 您的提交打败了 90.55% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution213 {

    /**
     * @param str: a string
     * @return: a compressed string
     */
    public String compress(String str) {
        // write your code here

        if (null == str || str.length() == 0) {
            return str;
        }

        char lastC = str.charAt(0);
        int count = 1;
        String newStr = "";

        int size = str.length();
        for (int i = 1; i < size; i++) {
            char c = str.charAt(i);

            if (c == lastC) {
                count++;
            } else {
                newStr = newStr + lastC + count;
                lastC = c;
                count = 1;
            }
        }

        //扫尾
        newStr = newStr + lastC + count;

        return newStr.length() < size ? newStr : str;
    }
}
