package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;

/**
 * 이진 트리 반전
 *
 * 시간 복잡도
 *   - O(n)
 *   모든 노드를 순회하면서 좌우를 스왑해주면된다.
  */
public class LeetCode_226_50 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            swap(root);
            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }

    void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
