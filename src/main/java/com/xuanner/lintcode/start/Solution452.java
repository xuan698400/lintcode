package com.xuanner.lintcode.start;

import com.xuanner.lintcode.common.ListNode;

/**
 * 452. 删除链表中的元素
 * 删除链表中等于给定值val的所有节点。
 * 样例
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 * Created by xuan on 2018/5/14.
 */
public class Solution452 {

    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (null == head) {
            return null;
        }

        if (null == head.next) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        }

        ListNode lastCusor = null;
        ListNode cusor = head;
        ListNode newHead = head;
        do {
            if (cusor.val != val) {
                lastCusor = null == lastCusor ? head : lastCusor.next;
                cusor = cusor.next;
            } else {
                if (null != lastCusor) {
                    lastCusor.next = cusor.next;
                } else {
                    newHead = cusor.next;
                }
                cusor = cusor.next;
            }
        } while (null != cusor);
        return newHead;
    }
}
