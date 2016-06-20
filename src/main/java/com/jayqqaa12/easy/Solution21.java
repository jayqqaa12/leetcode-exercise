package com.jayqqaa12.easy;

import com.jayqqaa12.ListNode;


/**
 * 合并2个有序 链表
 *
 * 保持其有序
 *
 * 难度1.5星
 *
 * @REVIEW
 */
public class Solution21 {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)return  l1==null? l2:l1;

        if(l1.val<l2.val){
            l1.next= mergeTwoLists(l1.next,l2);
            return  l1;
        }
        l2.next =mergeTwoLists(l1,l2.next);

        return l2;
        
    }
}