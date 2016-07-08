package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;


/**
 * 反转 m to n 区间的链表
 * <p>
 * 难度3星
 *
 * FIXME
 */
public class Solution92 {



    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < m-1; i++) prev = prev.next;  //找到 m 的prev

        ListNode start = prev.next;
        ListNode then = start.next;

        // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
        // dummy-> 1 -> 2 -> 3 -> 4 -> 5

        // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
        // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
        for (int i = 0; i < n-m; i++) {

            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }


        return dummy.next;
    }
}