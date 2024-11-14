package com.algo.tree.w8_241114;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class N_57Test {
    static N_57 sut = new N_57();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(10,
                new TreeNode(5, 3, 7),
                new TreeNode(15, null, 18));

        // When
        int result = sut.rangeSumBST(root, 7, 15);

        // Then
        assertThat(result).isEqualTo(32);
    }

}