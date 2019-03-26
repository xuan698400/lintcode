package com.xuanner.lintcode.start;

import com.xuanner.lintcode.common.TreeNode;

/**
 * 632. 二叉树的最大节点
 * 在二叉树中寻找值最大的节点并返回。
 * 样例
 * 给出如下一棵二叉树：
 * 1
 * /   \
 * -5     2
 * / \   /  \
 * 0   3 -4  -5
 * 返回值为 3 的节点。
 * Created by xuan on 2018/5/14.
 */
public class Solution632 {

    private TreeNode maxNode = null;

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        bianli(root);
        return maxNode;
    }

    private void bianli(TreeNode node) {
        if (null == node) {
            return;
        }

        if (null == maxNode) {
            maxNode = node;
        }

        if (maxNode.val < node.val) {
            maxNode = node;
        }
        bianli(node.left);
        bianli(node.right);
    }
}
