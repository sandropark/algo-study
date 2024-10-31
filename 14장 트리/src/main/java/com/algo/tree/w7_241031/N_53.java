package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;

/*
릿코드 110. 균형 이진 트리

Constraints:
-  The number of nodes in the tree is in the range [0, 5000].
-  -104 <= Node.val <= 104

시간 복잡도
- O(n) n의 최대 크기는 5000
 */
public class N_53 {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -2;
    }

    int dfs(TreeNode node) {
        if (node == null) return -1;

        int leftLevel = dfs(node.left);
        if (leftLevel == -2)  // 높이가 2이상 차이가 난 경우
            return -2;

        int rightLevel = dfs(node.right);

        if (rightLevel == -2 // 높이가 2이상 차이가 난 경우
                || Math.abs(leftLevel - rightLevel) > 1) // 왼쪽과 오른쪽 높이 차가 2이상 나는 경우
            return -2;

        return Math.max(leftLevel, rightLevel) + 1;  // 더 깊은 쪽을 찾아서 1을 더하면 현재 노드의 높이가 된다.
    }
}
