package com.algo.tree.w8_241114;

import com.algo.tree.TreeNode;

public class N_57 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        // val을 확인해서 low보다 작은 경우 right를 재귀호출
        if (root.val < low)
            return rangeSumBST(root.right, low, high);

        // val을 확인해서 high보다 작은 경우 left를 재귀호출
        if (root.val > high)
            return rangeSumBST(root.left, low, high);

        // 범위 안이라는 뜻이니까 해당 값과 하위 모든 노드를 재귀 호출해서 합치기
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
