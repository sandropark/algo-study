package com.algo.tree.w5_241017;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_104_47Test {
    static LeetCode_104_47 sut = new LeetCode_104_47();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        // When
        int depth = sut.maxDepth(root);

        // Then
        assertThat(depth).isEqualTo(3);
    }
}