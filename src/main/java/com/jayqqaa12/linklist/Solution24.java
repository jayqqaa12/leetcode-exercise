package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

/**
 * 交换 相邻的节点
 * 难度2星
 *
 * FIXME
 *
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode current = newNode;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return newNode.next;
    }
}