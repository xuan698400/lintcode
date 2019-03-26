package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.ListNode;

/**
 * 166. 链表倒数第n个节点
 * 找到单链表倒数第n个节点，保证链表中节点的最少数量为n。
 * 样例
 * 给出链表 3->2->1->5->null和n = 2，返回倒数第二个节点的值1.
 * 结果
 * 您的提交打败了 89.20% 的提交!
 * Created by xuan on 2018/5/16.
 */
public class Solution166 {

    /*
         * @param head: The first node of linked list.
         * @param n: An integer
         * @return: Nth to last node of a singly linked list.
         */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (null == head || n == 0) {
            return null;
        }

        ListNode cursor1 = head;
        ListNode cursor2 = head.next;

        for (int i = 1; i < n; i++) {
            if (null == cursor2) {
                return null;//说明节点数小于n
            }
            cursor2 = cursor2.next;
        }

        while (null != cursor2) {
            cursor2 = cursor2.next;
            cursor1 = cursor1.next;
        }

        return cursor1;
    }
}
