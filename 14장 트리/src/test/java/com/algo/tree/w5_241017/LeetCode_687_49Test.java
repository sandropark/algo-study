package com.algo.tree.w5_241017;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_687_49Test {
    static LeetCode_687_49 sut = new LeetCode_687_49();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(1, new TreeNode(1), new TreeNode(1));

        // When
        int depth = sut.longestUnivaluePath(root);

        // Then
        assertThat(depth).isEqualTo(2);
    }

    @Test
    void test1() throws Exception {
        // Given
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(1), new TreeNode(1)),
                new TreeNode(5, null, new TreeNode(5)));

        // When
        int depth = sut.longestUnivaluePath(root);

        // Then
        assertThat(depth).isEqualTo(2);
    }

    @Test
    void test2() throws Exception {
        // Given
        TreeNode root = new TreeNode(1,
                new TreeNode(4, new TreeNode(4), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(5)));

        // When
        int depth = sut.longestUnivaluePath(root);

        // Then
        assertThat(depth).isEqualTo(2);
    }
}