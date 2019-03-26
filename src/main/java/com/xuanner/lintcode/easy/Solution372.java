package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.ListNode;

/**
 * 372. Delete Node in a Linked List
 * 给定一个单链表中的一个等待被删除的节点(非表头或表尾)。请在在O(1)时间复杂度删除该链表节点。
 * 样例
 * Linked list is 1->2->3->4, and given node 3, delete the node in place 1->2->4
 * Created by xuan on 2018/5/14.
 */
public class Solution372 {

    /*
         * @param node: the node in the list should be deletedt
         * @return: nothing
         */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
