package com.jayqqaa12;

public class Subtree {
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T2 == null) return true;
        else if (T1 == null) return false;
        else return compare(T1, T2) || isSubtree(T1.left, T2) || isSubtree(T1.right, T2);

    }
    //Recursive compare
    public boolean compare(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        if (node1.val != node2.val) return false;

        return compare(node1.left, node2.left) && compare(node1.right, node2.right);
    }
}