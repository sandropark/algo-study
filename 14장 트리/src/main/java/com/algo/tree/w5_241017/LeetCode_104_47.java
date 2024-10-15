package com.algo.tree.w5_241017;

// 104. Maximum Depth of Binary Tree 이진 트리의 최대 깊이

/**
 * Constraints:
 * -   The number of nodes in the tree is in the range [0, 10^4].
 * -   -100 <= Node.val <= 100
 * <p>
 * 노드의 최대 개수는 1만 개
 * 노드의 값은 신경 쓸 필요가 없다.
 * 노드 전체를 한 번만 순회하면 깊이를 알 수 있기 때문에 O(n)이다.
 * <p>
 * submissions
 * 1. 0ms(100%), 42.45mb(63.53%)
 */


public class LeetCode_104_47 {
    public int maxDepth(TreeNode root) {
        return depth(root, 1);  // 시작 노드는 depth 1
    }

    int depth(TreeNode node, int depth) {
        if (node == null)
            return depth - 1;

        // 왼쪽, 오른쪽 내려가면서 depth를 1씩 증가시킨다. 최대 깊이에 도달하면 depth를 반환하기 때문에 max값만 찾으면 된다.
        return Math.max(
                depth(node.left, depth + 1),
                depth(node.right, depth + 1)
        );
    }
}