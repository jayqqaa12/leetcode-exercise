package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

import java.util.Stack;


/**
 * 判断是否为 回文链表
 * <p>
 * 要求 时间为 n  空间为 1
 * <p>
 * 难度 2星
 *
 * FIXME
 */
public class Solution234 {


    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) slow = slow.next;

        while(slow!=null){
            if(slow.val!=stack.pop())return false;
            slow=slow.next;
        }

        return true;
    }


}