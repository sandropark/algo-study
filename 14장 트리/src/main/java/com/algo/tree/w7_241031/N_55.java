package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;

/*
108. 정렬된 배열의 이진 탐색 트리 변환

Constraints:
-   1 <= nums.length <= 10^4      ->   최대 10000
-   -10^4 <= nums[i] <= 10^4
-   nums is sorted in a strictly increasing order.

시간 복잡도
- O(N)

 */
public class N_55 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    public TreeNode construct(int[] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) return null;

        int mid = startIdx + (endIdx - startIdx) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = construct(nums, startIdx, mid - 1);
        node.right = construct(nums, mid + 1, endIdx);

        return node;
    }
}
