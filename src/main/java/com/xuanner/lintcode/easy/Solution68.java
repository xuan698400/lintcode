package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. 二叉树的后序遍历
 * 给出一棵二叉树，返回其节点值的后序遍历。
 * 样例
 * 给出一棵二叉树 {1,#,2,3},
 * 1
 * \
 * 2
 * /
 * 3
 * 返回 [3,2,1]
 * 挑战
 * 你能使用非递归实现么？
 * Created by xuan on 2018/5/14.
 */
public class Solution68 {

    /**
     * @param root: A Tree
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (null == root) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        if (null == root.left && null == root.right) {
            list.add(root.val);
            return list;
        }

        List<Integer> leftList = postorderTraversal(root.left);
        if (null != leftList) {
            list.addAll(leftList);
        }

        List<Integer> rightList = postorderTraversal(root.right);
        if (null != rightList) {
            list.addAll(rightList);
        }

        list.add(root.val);

        return list;
    }
}
