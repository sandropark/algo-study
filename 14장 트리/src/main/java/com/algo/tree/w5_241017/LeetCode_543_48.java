package com.algo.tree.w5_241017;

// 543. Diameter of Binary Tree 이진 트리의 직경

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Constraints:
 * -   The number of nodes in the tree is in the range [1, 104].
 * -   -100 <= Node.val <= 100
 * <p>
 *
 * 모든 노드를 순회하면서 노드의 직경(왼쪽 최대 깊이 + 오른쪽 최대 깊이)을 구하고 그중에 가장 큰 값을 반환.
 * 시간 복잡도 : O(n^2)?? (n의 최대 크기는 10000이니까 최악의 경우 1억 필요)
 *
 * Submissions
 * 1. 191ms(6.97%), 44.49mb(82.51%)
 */
public class LeetCode_543_48 {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            TreeNode left = node.left;
            if (left != null) q.add(left);
            TreeNode right = node.right;
            if (right != null) q.add(right);
            diameter = Math.max(diameter, getDiameter(node));
        }
        return diameter;
    }

    int getDiameter(TreeNode node) {
        return depth(node.left, 0) + depth(node.right, 0);
    }

    int depth(TreeNode node, int depth) {
        if (node == null)
            return depth;

        return Math.max(
                depth(node.left, depth + 1),
                depth(node.right, depth + 1)
        );
    }
}
