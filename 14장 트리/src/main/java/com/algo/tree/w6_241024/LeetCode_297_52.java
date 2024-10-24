package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;

import java.util.LinkedList;

/**
 * 이진 트리의 직렬화 & 역직렬화
 */
public class LeetCode_297_52 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // 인덱스를 0부터 채우기위해서 추가
        StringBuilder sb = new StringBuilder("#,");
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.pop();
            // 노드가 null인 경우, 자리수를 채우기 위해서 '#'를 넣고 다음 반복으로
            if (node == null) {
                sb.append("#,");
                continue;
            }
            sb.append(node.val).append(",");
            q.offer(node.left);
            q.offer(node.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");

        String val = split[1];
        if (val.equals("#")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        int index = 2;
        while (!q.isEmpty()) {
            TreeNode node = q.pop();

            if (!split[index].equals("#")) {
                node.left = new TreeNode(Integer.parseInt(split[index]));
                q.add(node.left);
            }

            index++;

            if (!split[index].equals("#")) {
                node.right = new TreeNode(Integer.parseInt(split[index]));
                q.add(node.right);
            }

            index++;
        }

        return root;
    }
}
