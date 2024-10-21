package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_617_51Test {
    static LeetCode_617_51 sut = new LeetCode_617_51();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));

        // When
        TreeNode result = sut.mergeTrees(root1, root2);

        // Then
        assertThat(result.val).isEqualTo(3);
        assertThat(result.left.val).isEqualTo(4);
        assertThat(result.right.val).isEqualTo(5);
        assertThat(result.left.left.val).isEqualTo(5);
        assertThat(result.left.right.val).isEqualTo(4);
        assertThat(result.right.right.val).isEqualTo(7);
    }
}