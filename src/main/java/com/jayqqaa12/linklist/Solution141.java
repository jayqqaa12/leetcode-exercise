package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 判断是否为循环 链表
 * <p>
 * 难度1星
 */
public class Solution141 {

    /**
     * 思路
     *
     * 移动2个节点 步数不同
     *
     * 看看是否会相遇
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        if(head==null)return false;

        ListNode slow =head;
        ListNode fast =head;

        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }

        return false;

    }
}