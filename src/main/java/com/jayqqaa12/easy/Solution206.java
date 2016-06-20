package com.jayqqaa12.easy;

import com.jayqqaa12.ListNode;

/**
 * 反转单向链表
 *
 * 难度 1.5星
 *
 * @REVIEW
 */
public class Solution206 {


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