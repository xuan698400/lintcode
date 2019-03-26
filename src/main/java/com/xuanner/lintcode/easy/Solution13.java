package com.xuanner.lintcode.easy;

/**
 * 13. Implement strStr()
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 * 样例
 * 如果 source = "source" 和 target = "target"，返回 -1。
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 * 挑战
 * O(n2)的算法是可以接受的。如果你能用O(n)的算法做出来那更加好。（提示：KMP）
 * Created by xuan on 2018/5/14.
 */
public class Solution13 {

    /*
        * @param source: source string to be scanned.
        * @param target: target string containing the sequence of characters to match
        * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
        */
    public int strStr(String source, String target) {
        // write your code here
        if (null == target) {
            return -1;
        }

        if (target.length() == 0) {
            return 0;
        }

        if (null == source || source.length() == 0) {
            return -1;
        }

        int sourceSize = source.length();
        int targetSize = target.length();
        for (int i = 0; i < sourceSize; i++) {
            if (sourceSize - i < targetSize) {
                break;
            }

            boolean isMatch = false;
            for (int j = 0; j < targetSize; j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
                if (source.charAt(i + j) == target.charAt(j) && j == targetSize - 1) {
                    isMatch = true;
                    break;
                }
            }
            if (isMatch) {
                return i;
            }
        }
        return -1;
    }
}
