package com.algo.heap.w9_241121;

import java.util.PriorityQueue;

/*
60. 릿코드 215. Kth Largest Element in an Array

Constraints:

1 <= k <= nums.length <= 10^5 (100k)
    - n^2은 안 됨
-10^4 <= nums[i] <= 10^4
    - 큰 상관 없음

시간 복잡도 : O(n log k)
공간 복잡도 : O(k)
 */
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
