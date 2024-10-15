package com.algo.tree.w5_241017;

// 104. Maximum Depth of Binary Tree 이진 트리의 최대 깊이
public class LeetCode_104_47 {
    public int maxDepth(TreeNode root) {
        return depth(root, 1);
    }

    int depth(TreeNode node, int depth) {
        if (node == null)
            return depth - 1;
        return Math.max(
                depth(node.left, depth + 1),
                depth(node.right, depth + 1)
        );
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

