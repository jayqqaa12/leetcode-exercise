package com.jayqqaa12.easy;


import com.jayqqaa12.ListNode;

/**
 *
 * 删除节点
 *
 * 没啥好说
 *
 * 难度1星
 *
 */
public class Solution237 {


    public void deleteNode(ListNode node) {


        if(node!=null&&node.next!=null){
            node.val=node.next.val;
            node.next = node.next.next;
        }

    }
}