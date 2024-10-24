package com.algo.tree.w6_241024;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode_297_52Test {
    static LeetCode_297_52 sut = new LeetCode_297_52();

    @Test
    void test() throws Exception {
        // Given
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(
                        3,
                        new TreeNode(4),
                        new TreeNode(5)));

        // When
        String result = sut.serialize(root);

        // Then
        assertThat(result).isEqualTo("#,1,2,3,#,#,4,5,#,#,#,#,");
    }

    @Test
    void test2() throws Exception {
        // Given

        // When
        TreeNode result = sut.deserialize("#,1,2,3,#,#,4,5,#,#,#,#,");

        /*
             1
          2     3
         n n   6 7
         */

        // Then
        assertThat(result.val).isEqualTo(1);
        assertThat(result.left.val).isEqualTo(2);
        assertThat(result.right.val).isEqualTo(3);
        assertThat(result.left.left).isNull();
        assertThat(result.left.right).isNull();
        assertThat(result.right.left.val).isEqualTo(4);
        assertThat(result.right.right.val).isEqualTo(5);
    }

    @Test
    void test3() throws Exception {
        // Given

        // When
        String result = sut.serialize(null);

        // Then
        assertThat(result).isEqualTo("#,#,");
    }

    @Test
    void test4() throws Exception {
        // Given

        // When
        TreeNode result = sut.deserialize("#,#,");

        // Then
        assertThat(result).isNull();
    }
}