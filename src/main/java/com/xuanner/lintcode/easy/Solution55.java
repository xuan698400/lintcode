package com.xuanner.lintcode.easy;

/**
 * 55. 比较字符串
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 * 样例
 * 给出 A = "ABCD" B = "ACD"，返回 true
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 * 结果
 * 您的提交打败了 68.60% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution55 {

    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here

        int[] match = new int[26];

        int aSize = A.length();
        for (int i = 0; i < aSize; i++) {
            char c = A.charAt(i);
            int index = c - 'A';
            match[index]++;
        }

        int bSize = B.length();
        for (int i = 0; i < bSize; i++) {
            char c = B.charAt(i);
            int index = c - 'A';
            match[index]--;
            if (match[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
