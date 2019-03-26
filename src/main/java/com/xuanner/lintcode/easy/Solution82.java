package com.xuanner.lintcode.easy;

/**
 * 82. 落单的数
 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 * 样例
 * 给出 [1,2,2,1,3,4,3]，返回 4
 * 挑战
 * 一次遍历，常数级的额外空间复杂度
 * 结果
 * 您的提交打败了 19.60% 的提交!
 * Created by xuan on 2018/5/17.
 */
public class Solution82 {

    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        if (null == A || A.length == 0) {
            return -1;
        }

        if (A.length == 1) {
            return A[0];
        }

        int size = A.length;
        int temp = A[0];
        for (int i = 1; i < size; i++) {
            temp = temp ^ A[i];
        }
        return temp;
    }
}
