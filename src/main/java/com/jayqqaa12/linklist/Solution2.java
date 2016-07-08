package com.jayqqaa12.linklist;

import com.jayqqaa12.ListNode;


/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * 输入2个链表 是逆序的 然后计算结果 逆序输出
 * <p>
 * 就是  342 +465= 807  =》7-0-8
 * <p>
 * 难度2星
 */
public class Solution2 {


    /**
     * 直接加就行了 最优解
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;    //表示进位
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }









    /**
     * 一开始想的暴力解法 超时
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        StringBuffer sb1 = new StringBuffer();
        while (l1 != null) {
            sb1.insert(0, l1.val);
        }
        StringBuffer sb2 = new StringBuffer();
        while (l2 != null) {
            sb2.insert(0, l2.val);
        }
        String sum = new StringBuffer(Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()) + "").reverse().toString();

        ListNode newNode = new ListNode(-1);

        ListNode temp = newNode;
        for (int i = 0; i < sum.length(); i++) {
            temp.next = new ListNode(sum.charAt(i) - '0');
            temp = temp.next;
        }

        return  newNode.next;

    }
}