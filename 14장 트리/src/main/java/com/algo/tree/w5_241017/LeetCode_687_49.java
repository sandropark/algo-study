package com.algo.tree.w5_241017;

// 687. Longest Univalue Path 가장 긴 동일 값의 경로

/**
 * Constraints:
 * -   The number of nodes in the tree is in the range [0, 10^4].
 * -   -1000 <= Node.val <= 1000
 * -   The depth of the tree will not exceed 1000.
 *
 * 시간 복잡도 : O(n)
 * - 모든 노드를 한 번씩 방문하면 된다.
 * 공간 복잡도 : 최대 깊이가 1000을 넘지 않기 때문에 스택은 충분할 듯.
 *
 * Submissions:
 * 1. 2ms(96.51%), 46.91mb(25.55%)
 */
public class LeetCode_687_49 {
    int diameter = 0;

    public int longestUnivaluePath(TreeNode root) {
        depth(root, Integer.MAX_VALUE);
        return diameter;
    }

    int depth(TreeNode node, int parentVal) {
        if (node == null) return 0;

        int left = depth(node.left, node.val);
        int right = depth(node.right, node.val);

        this.diameter = Math.max(diameter, left + right);

        if (node.val == parentVal)
            return Math.max(left, right) + 1;
        return 0;
    }
}
