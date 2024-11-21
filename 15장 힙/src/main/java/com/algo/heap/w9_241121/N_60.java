package com.algo.heap.w9_241121;

import com.algo.heap.BinaryHeap;

public class N_60 {
    public int findKthLargest(int[] nums, int k) {
        BinaryHeap binaryHeap = new BinaryHeap(true);

        for (int num : nums)
            binaryHeap.insert(num);

        for (int i = 0; i < k - 1; i++)
            binaryHeap.pop();

        return binaryHeap.elems.get(1);
    }
}
