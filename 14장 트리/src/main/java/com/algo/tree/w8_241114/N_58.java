package com.algo.tree.w8_241114;

import com.algo.tree.TreeNode;

public class N_58 {
    /**
     * 시간복잡도
     * O(n) 다 순회하면 된다.
     */
    Integer prev = null; // 이전 노드의 값을 저장
    int minDiff = 100_001; // 최소 차이 초기화. 최소 값 0, 최대 값이 100,000

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);  // 중위순회
        return minDiff;
    }

    void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        // 왼쪽 서브트리 탐색
        inOrderTraversal(node.left);

        if (prev != null)
            // 현재 노드와 이전 노드 간의 차이 계산
            minDiff = Math.min(minDiff, node.val - prev);

        prev = node.val; // 현재 노드 값을 이전 노드로 저장

        // 오른쪽 서브트리 탐색
        inOrderTraversal(node.right);
    }

    /*
    1. root 10에서 출발
    2. left 4로 이동
    3. left 1로 이동.
    1의 left 는 없기 때문에 이전 노드랑 차이 계산.
    이전 노드가 null이기 pass
    prev = 1
    right 탐색. right 도 null이라 4로 이동
    4. 4 - prev = 3. minDiff = 3. 4의 right 인 8로 이동
    5. left 7로 이동
    ...
     */
}
