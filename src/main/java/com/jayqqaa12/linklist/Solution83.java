package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

import java.util.List;

/**
 * 给定一个排序的 链表
 * 删除其重复数的节点
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * 难度1星
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }

        return head;
    }


}