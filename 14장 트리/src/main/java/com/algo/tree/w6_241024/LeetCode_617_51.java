package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;

/**
 * 두 이진 트리의 병합
 */
public class LeetCode_617_51 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }
}
