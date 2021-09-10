package com.leetcode;


/**
 *
 */
public class searchBST {

    /**
     * 二叉搜索树查询某个值
     *
     * @param root 入参
     * @param val 入参
     * @return 返回值
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else
            return searchBST(root.right, val);
    }
}


class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;
}
