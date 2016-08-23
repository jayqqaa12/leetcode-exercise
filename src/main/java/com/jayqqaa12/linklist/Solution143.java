package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;


/**
 * 重新排序
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * <p>
 * <p>
 * <p>
 * 难度2星
 */
public class Solution143 {


    /**
     *   首先，把链表分成前半部分和后半部分，
     *   然后把后半部分反序，最后把后半部分依次插入前半部分。

     * @param head
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode p1 =head;
        ListNode p2=head;

        //find middle
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=p1;
        ListNode preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }



    }
}