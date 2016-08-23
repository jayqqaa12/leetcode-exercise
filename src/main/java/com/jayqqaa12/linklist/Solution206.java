package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

/**
 * 反转单向链表
 *
 * 难度 1.5星
 *
 *
 * FIXME
 */
public class Solution206 {


    /**
     *
     * 我们先让头结点的next域指向结点a2，
     * 再让结点a1的next域指向结点a3，
     * 最后将结点a2的next域指向结点a1，
     *
     * 循环
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;

            head = next;
        }

        return newHead;
    }

}