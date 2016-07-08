package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;


/**
 * 插入排序
 *
 *
 * 难度2星
 *
 * FIXME
 *
 */
public class Solution147 {



    public ListNode insertionSortList(ListNode head) {
        if(head==null)return  head;

        ListNode dummy = new ListNode(-1);
        ListNode pre= dummy;
        ListNode curr =head;

        ListNode next = null;
        while (curr!=null){

            next = curr.next;
            while (pre.next!=null&& pre.next.val<curr.val){
                pre= pre.next;
            }

            curr.next=pre.next;
            pre.next=curr;
            pre = dummy;
            curr=next;
        }



        return  dummy.next;
        
    }
}