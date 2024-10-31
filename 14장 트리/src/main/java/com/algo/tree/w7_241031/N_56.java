package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;

/*
1038. 이진 탐색 트리를 더 큰수 합계 트리로

Constraints:

-  The number of nodes in the tree is in the range [1, 100].
-  0 <= Node.val <= 100
-  All the values in the tree are unique.

시간 복잡도: O(N)
 */
public class N_56 {
    int val = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null)
            bstToGst(root.right);

        root.val = val += root.val;

        if (root.left != null)
            bstToGst(root.left);

        return root;
    }
}
