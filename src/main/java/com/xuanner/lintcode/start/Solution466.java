package com.xuanner.lintcode.start;

import com.xuanner.lintcode.common.ListNode;

/**
 * 466. 链表节点计数
 * 计算链表中有多少个节点.
 * 样例
 * 给出 1->3->5, 返回 3.
 * Created by xuan on 2018/5/14.
 */
public class Solution466 {

    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        if (null == head) {
            return 0;
        }

        int count = 1;
        ListNode cusor = head;
        while (null != cusor.next) {
            count++;
            cusor = cusor.next;
        }
        return count;
    }
}
