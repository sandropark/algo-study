package com.algo.heap.w9_241121;

import java.util.PriorityQueue;

public class N_60 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        return minHeap.poll();
    }
}
