package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class N_53Test {
    static N_53 sut = new N_53();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(3,
                9,
                new TreeNode(20, 15, 7));

        // When
        boolean result = sut.isBalanced(root);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void test2() throws Exception {
        // Given
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                4,
                                4),
                        3),
                2);

        // When
        boolean result = sut.isBalanced(root);

        // Then
        assertThat(result).isFalse();
    }

}