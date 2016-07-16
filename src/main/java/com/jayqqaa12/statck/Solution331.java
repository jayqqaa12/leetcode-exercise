package com.jayqqaa12.statck;

/**
 * 验证 二叉树序列化 是否有效
 * 序列化方式为前序遍历 #表示null节点
 *
 * Example 1:
 * "9,3,4,#,#,1,#,#,2,#,6,#,#"
 * Return true
 * <p>
 * Example 2:
 * "1,#"
 * Return false
 *
 * 要求不能重建树的方式验证
 *
 * 难度2.5星
 */
public class Solution331 {


    /**
     * 最简单的方式
     * @param preorder
     * @return
     */
    public boolean isValidSerialization2(String preorder) {
        String s = preorder.replaceAll("\\d+,#,#", "#");
        return s.equals("#") || !s.equals(preorder) && isValidSerialization2(s);
    }


    /**
     * 最优解
     *
     * 通过计算 #的个数 判断应该有多少个节点
     *
     * @param preorder
     * @return
     */
    public boolean isValidSerialization(String preorder) {
        String[] strs = preorder.split(",");
        int degree = -1;         // root has no indegree, for compensate init with -1
        for (String str: strs) {
            degree++;             // all nodes have 1 indegree (root compensated)
            if (degree > 0) {     // total degree should never exceeds 0
                return false;
            }
            if (!str.equals("#")) {// only non-leaf node has 2 outdegree
                degree -= 2;
            }
        }
        return degree == 0;
    }
}