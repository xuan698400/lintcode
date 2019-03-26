package com.xuanner.lintcode.easy;

/**
 * 422. 最后一个单词的长度
 * 给定一个字符串， 包含大小写字母、空格' '，请返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 样例
 * 给定 s = "Hello World"，返回 5。
 * 结果
 * 您的提交打败了 73.00% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution422 {

    /**
     * @param s: A string
     * @return: the length of last word
     */
    public int lengthOfLastWord(String s) {
        // write your code here

        if (null == s || s.length() == 0) {
            return 0;
        }

        int size = s.length();
        int lastCount = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                lastCount = count;
                count = 0;
            } else {
                count++;
            }
        }
        return count > 0 ? count : lastCount;
    }
}
