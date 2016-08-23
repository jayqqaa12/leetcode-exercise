package com.jayqqaa12;

import java.util.Stack;


/**
 * 将一个二叉查找树按照中序遍历转换成双向链表。
 */
public class CovertBSTToDoublyLink {
    public DoublyListNode bstToDoublyList(TreeNode root) {
        if (root == null) return null;

        //Init stack
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        stack.push(node);
        //Create DoublyListNode header
        DoublyListNode dummy = new DoublyListNode(-1);
        DoublyListNode dNode = dummy;

        while (!stack.isEmpty()) {
            while (node != null && node.left != null) {
                stack.push(node.left);
                node = node.left;
            }
            //add node
            node = stack.pop();
            DoublyListNode curr = new DoublyListNode(node.val);
            dNode.next = curr;
            curr.prev = dNode;
            dNode = dNode.next;

            //check right node and add to stack
            node = node.right;
            if (node != null) {
                stack.push(node);
            }
        }

        return dummy.next;

    }
}