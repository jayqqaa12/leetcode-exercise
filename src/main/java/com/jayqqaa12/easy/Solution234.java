package com.jayqqaa12.easy;

import com.jayqqaa12.ListNode;


/**
 * 判断是否为 回文链表
 * <p>
 * 要求 时间为 n  空间为 1
 * <p>
 * 难度 2星
 *
 * @REVIEW
 */
public class Solution234 {


    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) slow = slow.next;

        slow = reverse(slow);

        while (slow != null && head.val == slow.val) {

            head = head.next;
            slow = slow.next;

        }

        return slow == null;
    }

    private ListNode reverse(ListNode head) {
        ListNode newNode = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = newNode;

            newNode = head;
            head = next;
        }

        return newNode;
    }
}