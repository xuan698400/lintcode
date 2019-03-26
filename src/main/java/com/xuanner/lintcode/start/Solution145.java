package com.xuanner.lintcode.start;

/**
 * 145. 大小写转换
 * 将一个字符由小写字母转换为大写字母
 * 样例
 * a -> A
 * b -> B
 * Created by xuan on 2018/5/14.
 */
public class Solution145 {

    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        return (char) (character - 32);
    }
}
