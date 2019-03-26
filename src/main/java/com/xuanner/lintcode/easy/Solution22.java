package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.NestedInteger;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 平面列表
 * 给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。
 * 样例
 * 给定 [1,2,[1,2]]，返回 [1,2,1,2]。
 * 给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。
 * 挑战
 * 请用非递归方法尝试解答这道题。
 * 结果
 * 您的提交打败了 94.80% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution22 {

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here

        List<Integer> resultList = new ArrayList<>();
        doFlatten(nestedList, resultList);
        return resultList;
    }

    private void doFlatten(List<NestedInteger> nestedList, List<Integer> resultList) {
        if (null == nestedList || nestedList.isEmpty()) {
            return;
        }
        for (int i = 0, n = nestedList.size(); i < n; i++) {
            NestedInteger ni = nestedList.get(i);
            if (ni.isInteger()) {
                resultList.add(ni.getInteger());
            } else {
                doFlatten(ni.getList(), resultList);
            }
        }
    }
}
