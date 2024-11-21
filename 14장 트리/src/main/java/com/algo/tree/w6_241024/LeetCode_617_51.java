package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;

/**
 * 두 이진 트리의 병합
 * <p>
 * 시간복잡도
 * 각 트리 별로 최대 개수는 2000개다.
 * 최대 2000개의 노드만 탐색하면 되기 때문에 O(n)이다.
 */
public class LeetCode_617_51 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // 두 노드 중 하나라도 null이면 반환된다.
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }
}
