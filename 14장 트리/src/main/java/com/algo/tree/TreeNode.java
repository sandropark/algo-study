package com.algo.tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, int leftVal, int rightVal) {
        this(val, new TreeNode(leftVal), new TreeNode(rightVal));
    }

    public TreeNode(int val, TreeNode left, int rightVal) {
        this(val, left, new TreeNode(rightVal));
    }

    public TreeNode(int val, int leftVal, TreeNode right) {
        this(val, new TreeNode(leftVal), right);
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}