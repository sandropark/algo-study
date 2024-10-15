package com.algo.tree.w5_241017;

// 687. Longest Univalue Path 가장 긴 동일 값의 경로

/**
 * Constraints:
 * -   The number of nodes in the tree is in the range [0, 104].
 * -   -1000 <= Node.val <= 1000
 * -   The depth of the tree will not exceed 1000.
 */
public class LeetCode_687_49 {
    int diameter = 0;

    public int longestUnivaluePath(TreeNode root) {
        depth(root);
        return diameter;
    }

    int depth(TreeNode node) {
        if (node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);

        this.diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}
