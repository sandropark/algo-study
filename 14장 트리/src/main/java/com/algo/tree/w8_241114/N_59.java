package com.algo.tree.w8_241114;

import com.algo.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class N_59 {
    Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        makeInorderIndexMap(inorder);

        return constructTree(preorder, 0, inorder.length - 1);
    }

    void makeInorderIndexMap(int[] inorder) {
        // 값을 key로, 인덱스를 value로
        for (int i = 0; i < inorder.length; i++)
            inorderIndexMap.put(inorder[i], i);
    }

    TreeNode constructTree(int[] preorder, int left, int right) {
        if (left > right) return null; // 서브트리가 없으면 null 반환

        // 전위 순회의 현재 노드 값을 가져옴
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // 중위 순회에서의 현재 노드의 인덱스를 찾음
        int inorderIndex = inorderIndexMap.get(rootValue);

        // 왼쪽 및 오른쪽 서브트리를 재귀적으로 구성
        root.left = constructTree(preorder, left, inorderIndex - 1);
        root.right = constructTree(preorder, inorderIndex + 1, right);

        return root;
    }
}
