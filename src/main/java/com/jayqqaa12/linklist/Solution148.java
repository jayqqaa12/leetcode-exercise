package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

/**
 * 使用 O(nlogn)的时间复杂度 和固定的空间 排序
 * <p>
 * 也就是归并排序
 * <p>
 * 难度2星
 */
public class Solution148 {

    /**
     * 先分组 再合并
     *
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode pre = null, fast = head, slow = head;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0), temp = newNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return newNode.next;
    }

}