package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;

/**
 * 找到循环链表的开始节点
 *
 * 难度2星
 *
 * FIXME
 */
public class Solution142 {


    /**
     * 思路
     *
     * 2个不同速度的指针
     * 如果2个指针相遇了说明是循环的
     * 然后再找到循环开始的点
     *
     * 再开始一个指针 知道追上慢指针就是循环 开始的点
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {

        if(head==null)return null;


        ListNode slow =head;
        ListNode fast =head;

        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                ListNode slow2= head;

                while (slow!=slow2){
                    slow=slow.next;
                    slow2=slow2.next;
                }
                return slow;
            }
        }


      return  null;
    }
}