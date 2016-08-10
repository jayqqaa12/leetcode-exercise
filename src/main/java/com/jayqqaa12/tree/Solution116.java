package com.jayqqaa12.tree;


import com.jayqqaa12.TreeLinkNode;


/**
 * 将一颗完美二叉树每一层用一个next指针连接起来，并且最右侧的节点指向NULL
 * 难度2.5星
 */
public class Solution116 {

    public void connect(TreeLinkNode root) {
        TreeLinkNode node=root;
        while(node!=null){
            TreeLinkNode cur=node;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

                cur=cur.next;
            }
            node=node.left;
        }
    }
}