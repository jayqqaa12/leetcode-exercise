package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;


/**
 * 去掉重复的节点
 * <p>
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * <p>
 * 难度2星
 */
public class Solution82 {


    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;

        while (curr != null) {

            //循环去掉重复的
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            if (pre.next == curr) pre = curr; //这里可以判断出是否有重复的 如果不是就pre 就下移
            else pre.next = curr.next;         //如果是就跳到一下

            curr = curr.next;
        }


        return dummy.next;
    }
}