package com.algo.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryHeapTest {
    @Test
    void insert() throws Exception {
        // Given
        BinaryHeap binaryHeap = new BinaryHeap();

        // When
        binaryHeap.insert(10);

        // Then
        assertThat(binaryHeap.elems.get(1)).isEqualTo(10);

        // When
        binaryHeap.insert(5);

        // Then
        assertThat(binaryHeap.elems.get(1)).isEqualTo(5);
        assertThat(binaryHeap.elems.get(2)).isEqualTo(10);

        // When
        binaryHeap.insert(3);

        // Then
        assertThat(binaryHeap.elems.get(1)).isEqualTo(3);
        assertThat(binaryHeap.elems.get(2)).isEqualTo(10);
        assertThat(binaryHeap.elems.get(3)).isEqualTo(5);

        // When
        binaryHeap.insert(4);

        // Then
        assertThat(binaryHeap.elems.get(1)).isEqualTo(3);
        assertThat(binaryHeap.elems.get(2)).isEqualTo(4);
        assertThat(binaryHeap.elems.get(3)).isEqualTo(5);
        assertThat(binaryHeap.elems.get(4)).isEqualTo(10);

        // when
        assertThat(binaryHeap.pop()).isEqualTo(3);
        assertThat(binaryHeap.elems).hasSize(4);
        assertThat(binaryHeap.elems.get(1)).isEqualTo(4);
        assertThat(binaryHeap.elems.get(2)).isEqualTo(10);
        assertThat(binaryHeap.elems.get(3)).isEqualTo(5);

        binaryHeap.insert(2);

        assertThat(binaryHeap.elems.get(1)).isEqualTo(2);
        assertThat(binaryHeap.elems.get(2)).isEqualTo(4);
        assertThat(binaryHeap.elems.get(3)).isEqualTo(5);
        assertThat(binaryHeap.elems.get(4)).isEqualTo(10);

        assertThat(binaryHeap.pop()).isEqualTo(2);
        assertThat(binaryHeap.pop()).isEqualTo(4);
        assertThat(binaryHeap.pop()).isEqualTo(5);
        assertThat(binaryHeap.pop()).isEqualTo(10);
    }

    @Test
    void test() throws Exception {
        BinaryHeap binaryHeap = new BinaryHeap();
        binaryHeap.elems.add(1);
        binaryHeap.elems.add(10);
        binaryHeap.elems.add(5);
        /*
            1
           / \
         10   5
         */

        assertThat(binaryHeap.pop()).isEqualTo(1);
        assertThat(binaryHeap.elems.get(1)).isEqualTo(5);
        assertThat(binaryHeap.elems.get(2)).isEqualTo(10);
    }
}