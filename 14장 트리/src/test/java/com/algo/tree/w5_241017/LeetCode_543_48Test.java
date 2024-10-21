package com.algo.tree.w5_241017;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_543_48Test {
    static LeetCode_543_48 sut = new LeetCode_543_48();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));

        // When
        int depth = sut.diameterOfBinaryTree(root);

        // Then
        assertThat(depth).isEqualTo(3);
    }

}