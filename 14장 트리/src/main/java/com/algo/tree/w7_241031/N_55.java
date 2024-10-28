package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;

/*
108. 정렬된 배열의 이진 탐색 트리 변환

Constraints:
-   1 <= nums.length <= 10^4      ->   최대 10000
-   -10^4 <= nums[i] <= 10^4
-   nums is sorted in a strictly increasing order.
 */
public class N_55 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int size = nums.length;
        int centerIndex = size / 2;

        int center = nums[centerIndex];
        TreeNode root = new TreeNode(center);

        int leftIndex = centerIndex - 1;
        int rightIndex = centerIndex + 1;

        if (leftIndex >= 0)
            root.left = new TreeNode(nums[leftIndex]);

        if (rightIndex < size-1)
            root.right = new TreeNode(nums[rightIndex]);

        return root;
    }
}
