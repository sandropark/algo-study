package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;

/**
 *  두 이진 트리의 병합
 *
 */
public class LeetCode_617_51 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();

        if (root1 != null && root2 != null) {
            root.val = root1.val + root2.val;
            root.left = mergeTrees(root1.left, root2.left);
            root.right = mergeTrees(root1.right, root2.right);
            return root;
        }

        if (root1 != null) {
            root.val = root1.val;
            root.left = mergeTrees(root1.left, null);
            root.right = mergeTrees(root1.right, null);
            return root;
        }

        if (root2 != null) {
            root.val = root2.val;
            root.left = mergeTrees(root2.left, null);
            root.right = mergeTrees(root2.right, null);
            return root;
        }

        return null;
    }
}
