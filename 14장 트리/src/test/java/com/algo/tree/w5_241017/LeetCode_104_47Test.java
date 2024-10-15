package com.algo.tree.w5_241017;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_104_47Test {
    static LeetCode_104_47 sut = new LeetCode_104_47();

    @Test
    void test() throws Exception {
        // Given
        LeetCode_104_47.TreeNode root = new LeetCode_104_47.TreeNode(3,
                new LeetCode_104_47.TreeNode(9),
                new LeetCode_104_47.TreeNode(20, new LeetCode_104_47.TreeNode(15), new LeetCode_104_47.TreeNode(7)));

        // When
        int depth = sut.maxDepth(root);

        // Then
        assertThat(depth).isEqualTo(3);
    }
}