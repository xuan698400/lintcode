package com.xuanner.lintcode.start;

/**
 * 37. 反转一个3位整数
 * 样例:
 * 123 反转之后是 321。
 * 900 反转之后是 9。
 * Created by xuan on 2018/5/14.
 */
public class Solution37 {

    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        int temp = number;

        int g = temp % 10;
        temp = temp / 10;

        int s = temp % 10;
        int b = temp / 10;

        return g * 100 + s * 10 + b;
    }
}
