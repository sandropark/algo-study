package com.algo.tree.w5_241017;

// 543. Diameter of Binary Tree 이진 트리의 직경

/**
 * Constraints:
 * -   The number of nodes in the tree is in the range [1, 104].
 * -   -100 <= Node.val <= 100
 * <p>
 * <p>
 * 리프 노드부터 직경을 계산해서 올라온다.
 * 시간 복잡도 : O(n^2)?? (n의 최대 크기는 10000이니까 최악의 경우 1억 필요)
 * <p>
 * Submissions
 * 1. 191ms(6.97%), 44.49mb(82.51%)
 * 2. 0ms(100%), 44.61mb(61.74%)
 */
public class LeetCode_543_48 {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
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
