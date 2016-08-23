package com.jayqqaa12;

public class RemoveNodeBST {
    public TreeNode removeNode(TreeNode root, int value) {
        if (root == null || (root.left == null && root.right == null)) {
            return null;
        }
        TreeNode dummy = new TreeNode(0);;
        dummy.left = root;
        //Find node
        TreeNode parent = findTargetParent(dummy, root, value);
        TreeNode child;
        if (parent.left != null && parent.left.val == value) {
            child = parent.left;
        } else if (parent.right != null && parent.right.val == value) {
            child = parent.right;
        } else {
            return dummy.left;
        }
        //Delete that node:
        deleteTargetNode(parent, child);
        return dummy.left;
    }


    //Find target node
    public TreeNode findTargetParent(TreeNode parent, TreeNode node, int value){
        if (node == null || node.val == value) {
            return parent;
        }
        
        if (value < node.val) {
            return findTargetParent(node, node.left, value);
        } else {
            return findTargetParent(node, node.right, value);
        }
    }
    //Delete node
    public void deleteTargetNode(TreeNode parent, TreeNode target) {
        //Case1 + case2: (target.L == null && target.R == null) || (target.R == null && target.L != null)
        if (target.right == null) {
            if (parent.left == target) {
                parent.left = target.left;
            } else {
                parent.right = target.left;
            }
        } else {//Case3: when target.right != null
            TreeNode replaceNode = target.right;
            TreeNode replaceParent = target;
            while(replaceNode.left != null) {
                replaceParent = replaceNode;
                replaceNode = replaceNode.left;
            }
            //Remove replaceNode from replaceParent
            if (replaceParent.left == replaceNode) {//Usually it'll be replaceParent.left
                replaceParent.left = replaceNode.right;
            } else {//Sometimes when target.left == null, than means replaceParent.right will be replaceNode (while loop didn't start at all)
                replaceParent.right = replaceNode.right;
            }
            
            //Remove target from parent: not sure it's left or right node of parent
            if (parent.left == target) {
                parent.left = replaceNode;
            } else {
                parent.right = replaceNode;
            }
            
            replaceNode.left = target.left;
            replaceNode.right = target.right;
        }
    }

}
