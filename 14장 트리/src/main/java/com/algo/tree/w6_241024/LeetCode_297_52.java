package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;

import java.util.LinkedList;

/**
 * 이진 트리의 직렬화 & 역직렬화
 */
public class LeetCode_297_52 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder("#,");
        LinkedList<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();

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

        for (int i = 2; i < split.length; i++) {
            String tempVal = split[i];
            if (!tempVal.equals("#")) {

            }
        }


        return root;
    }
}
