package com.algo.tree.w7_241031;

import com.algo.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class N_55Test {
    static N_55 sut = new N_55();

    @Test
    void test() throws Exception {
        // Given
        int[] nums = new int[]{-10, -3, 0, 5, 9};

        // When
        TreeNode result = sut.sortedArrayToBST(nums);

        // Then
        assertThat(result.val).isEqualTo(0);
        assertThat(result.left.val).isEqualTo(-3);
        assertThat(result.left.left.val).isEqualTo(-10);
        assertThat(result.right.val).isEqualTo(5);
        assertThat(result.right.right.val).isEqualTo(9);
    }

    @Test
    void test2() throws Exception {
        // Given
        int[] nums = new int[]{-10, -3, 0, 5};

        // When
        TreeNode result = sut.sortedArrayToBST(nums);

        // Then
        assertThat(result.val).isEqualTo(0);
        assertThat(result.left.val).isEqualTo(-3);
        assertThat(result.left.left.val).isEqualTo(-10);
        assertThat(result.right.val).isEqualTo(5);
    }

    @Test
    void test3() throws Exception {
        // Given
        int[] nums = new int[]{-3, 0, 5, 9};

        // When
        TreeNode result = sut.sortedArrayToBST(nums);

        // Then
        assertThat(result.val).isEqualTo(5);
        assertThat(result.left.val).isEqualTo(0);
        assertThat(result.right.val).isEqualTo(9);
        assertThat(result.left.left.val).isEqualTo(-3);
    }

}