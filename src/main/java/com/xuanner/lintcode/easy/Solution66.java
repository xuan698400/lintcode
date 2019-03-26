package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 66. 二叉树的前序遍历
 * 给出一棵二叉树，返回其节点值的前序遍历。
 * 样例
 * 给出一棵二叉树 {1,#,2,3},
 * 1
 * \
 * 2
 * /
 * 3
 * 返回 [1,2,3].
 * 挑战
 * 你能使用非递归实现么？
 * Created by xuan on 2018/5/14.
 */
public class Solution66 {

    /**
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        if (null == root) {
            return null;
        }

        List<Integer> list = new ArrayList<Integer>();
        if (null == root.left && null == root.right) {
            list.add(root.val);
            return list;
        }

        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(p);
        while (!stack.isEmpty()) {
            p = stack.pop();
            list.add(p.val);

            if (null != p.right) {
                stack.push(p.right);
            }

            if (null != p.left) {
                stack.push(p.left);
            }
        }
        return list;
    }
}
