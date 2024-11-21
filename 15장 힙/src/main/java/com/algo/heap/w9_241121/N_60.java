package com.algo.heap.w9_241121;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class N_60 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums)
            pq.add(num);

        for (int i = 0; i < k - 1; i++)
            pq.poll();

        return pq.poll();
    }
}
