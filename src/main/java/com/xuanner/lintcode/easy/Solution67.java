package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 67. 二叉树的中序遍历
 * 给出一棵二叉树,返回其中序遍历
 * 样例
 * 给出二叉树 {1,#,2,3},
 * 1
 * \
 * 2
 * /
 * 3
 * 返回 [1,3,2].
 * 挑战
 * 你能使用非递归算法来实现么?
 * Created by xuan on 2018/5/14.
 */
public class Solution67 {

    /**
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here

        if (null == root) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        if (null == root.left && null == root.right) {
            list.add(root.val);
            return list;
        }

        List<Integer> leftList = inorderTraversal(root.left);
        if (null != leftList) {
            list.addAll(leftList);
        }

        list.add(root.val);

        List<Integer> rightList = inorderTraversal(root.right);
        if (null != rightList) {
            list.addAll(rightList);
        }

        return list;
    }
}
