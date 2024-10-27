package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/*
릿코드 110. 균형 이진 트리


 */
public class N_53 {
    // 가장 높은 리프와 가장 낮은 리프의 높이 차이가 1이상 나는지 확인?

    public boolean isBalanced(TreeNode root) {
        int highestLeafLevel = Integer.MAX_VALUE;
        int lowestLeafLevel = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);

            for (TreeNode treeNode : q) {

            }
        }

        return false;
    }
}
