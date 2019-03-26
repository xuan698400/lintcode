package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.ListNode;

/**
 * 165. 合并两个排序链表
 * 将两个排序链表合并为一个新的排序链表
 * 样例
 * 给出 1->3->8->11->15->null，2->null， 返回 1->2->3->8->11->15->null。
 * 结果
 * 您的提交打败了 61.00% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution165 {

    /**
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }

        ListNode newHead;
        ListNode newCursor;
        ListNode cursor1;
        ListNode cursor2;
        if (l1.val < l2.val) {
            newHead = l1;
            cursor1 = l1.next;
            cursor2 = l2;
        } else {
            newHead = l2;
            cursor2 = l2.next;
            cursor1 = l1;
        }
        newCursor = newHead;

        while (null != cursor1 || null != cursor2) {
            if (null == cursor1 && null != cursor2) {
                newCursor.next = cursor2;
                cursor2 = cursor2.next;
            } else if (null != cursor1 && null == cursor2) {
                newCursor.next = cursor1;
                cursor1 = cursor1.next;
            } else {
                //都还有节点，比较只
                if (cursor1.val < cursor2.val) {
                    newCursor.next = cursor1;
                    cursor1 = cursor1.next;
                } else {
                    newCursor.next = cursor2;
                    cursor2 = cursor2.next;
                }
            }
            newCursor = newCursor.next;
        }
        return newHead;
    }
}
