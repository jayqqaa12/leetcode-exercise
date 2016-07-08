package com.jayqqaa12.linklist;


import com.jayqqaa12.ListNode;


/**
 * 删除对应值 val的节点
 * <p>
 * 难度1星
 */
public class Solution203 {

    /**
     * 递归法 最简单
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return head;
        head.next = removeElements(head, val);
        return head.val == val ? head.next : head;
    }


    /**
     * 迭代
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements2(ListNode head, int val) {

        ListNode start = new ListNode(0);
        start.next = head;
        ListNode curr = head, pre = start;

        while (curr != null) {
            if (curr.val == val) pre = curr.next;
            else pre = pre.next;
            curr = curr.next;
        }

        return start.next;
    }


}