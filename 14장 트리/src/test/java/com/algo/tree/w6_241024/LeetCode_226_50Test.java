package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_226_50Test {
    static LeetCode_226_50 sut = new LeetCode_226_50();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        // When
        TreeNode result = sut.invertTree(root);

        // Then
        assertThat(result.val).isEqualTo(2);
        assertThat(result.left.val).isEqualTo(3);
        assertThat(result.right.val).isEqualTo(1);
    }
}