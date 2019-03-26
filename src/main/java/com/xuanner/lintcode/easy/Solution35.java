package com.xuanner.lintcode.easy;

import com.xuanner.lintcode.common.ListNode;

/**
 * 35. 翻转链表
 * 翻转一个链表
 * 样例
 * 给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
 * 挑战
 * 在原地一次翻转完成
 * Created by xuan on 2018/5/14.
 */
public class Solution35 {

    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (null == head || null == head.next) {
            return head;
        }

        ListNode p = head.next;
        ListNode temp = p;
        ListNode pnext = p.next;
        head.next = null;
        p.next = head;

        while (null != pnext) {
            p = pnext;
            pnext = pnext.next;
            p.next = temp;
            temp = p;
        }
        return p;
    }
}
