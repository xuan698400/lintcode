package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.TreeNode;

/**
 * 85. 在二叉查找树中插入节点
 * 给定一棵二叉查找树和一个新的树节点，将节点插入到树中。
 * 你需要保证该树仍然是一棵二叉查找树。
 * 样例
 * 给出如下一棵二叉查找树，在插入节点6之后这棵二叉查找树可以是这样的：
 * 2             2
 * / \           / \
 * 1   4   -->   1   4
 * /             / \
 * 3             3   6
 * 挑战
 * 能否不使用递归？
 * 结果
 * 您的提交打败了 59.80% 的提交!
 * Created by xuan on 2018/5/17.
 */
public class Solution85 {

    /*
         * @param root: The root of the binary search tree.
         * @param node: insert this node into the binary search tree
         * @return: The root of the new binary search tree.
         */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here

        if (null == root) {
            return node;
        }

        if (null == node) {
            return root;
        }

        doTreeNode(root, node);
        return root;
    }

    public void doTreeNode(TreeNode root, TreeNode node) {
        if (node.val >= root.val) {
            if (null == root.right) {
                root.right = node;
            } else {
                doTreeNode(root.right, node);
            }
        } else {
            if (null == root.left) {
                root.left = node;
            } else {
                doTreeNode(root.left, node);
            }
        }
    }
}
