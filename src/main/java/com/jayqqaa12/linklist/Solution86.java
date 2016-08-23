package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;


/**
 * 使比x 小的node
 * 都移到 left
 * 原顺序保存不变
 *
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 * 难度1.5星
 *
 * FIXME
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {

        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
        ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
        while (head!=null){
            if (head.val<x) {
                curr1.next = head;
                curr1 = head;
            }else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }
        curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
        curr1.next = dummy2.next;
        return dummy1.next;

    }
}