package com.algo.heap;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {
    public final List<Integer> elems = new ArrayList<>();
    private final boolean isMax;


    public BinaryHeap() {
        this(false);
    }

    public BinaryHeap(boolean isMax) {
        this.elems.add(null);
        this.isMax = isMax;
    }

    public void insert(int k) {
        // 새로운 원소 추가
        elems.add(k);
        // 업힙 연산
        percolateUp();
    }

    private void percolateUp() {
        // 방금 추가된 원소의 인덱스
        int idx = elems.size() - 1;
        // 부모 노드의 인덱스
        int parentIdx = idx / 2;

        // 부모 노드가 존재하고, 부모 노드 값이 현재 노드 값보다 크다면
        while (parentIdx > 0 && compare(idx, parentIdx)) {
            // 부모 노드와 현재 노드의 값을 교환
            swap(idx, parentIdx);
            // 현재 노드의 인덱스를 부모 노드의 인덱스로 변경
            idx = parentIdx;
            // 부모 노드의 인덱스 업데이트
            parentIdx = idx / 2;
        }
    }

    private boolean compare(int idx, int parentIdx) {
        if (isMax)
            return elems.get(idx) > elems.get(parentIdx);
        return elems.get(idx) < elems.get(parentIdx);
    }

    public int pop() {
        int lastIdx = elems.size() - 1;
        // 루트와 마지막 노드를 스왑
        swap(1, lastIdx);
        // 마지막 노드 제거 (= 루트 추출)
        Integer root = elems.remove(lastIdx);
        // 다운힙
        percolateDown(1);
        return root;
    }

    private void percolateDown(int idx) {
        int targetIdx = idx;
        int leftIdx = targetIdx * 2;
        int rightIdx = leftIdx + 1;
        int lastIdx = elems.size() - 1;

        // 자식 중 더 작은 놈을 찾기
        if (leftIdx <= lastIdx && compare(leftIdx, targetIdx))
            targetIdx = leftIdx;

        if (rightIdx <= lastIdx && compare(rightIdx, targetIdx))
            targetIdx = rightIdx;

        if (targetIdx != idx) {
            swap(targetIdx, idx);
            percolateDown(targetIdx);
        }
    }

    private void swap(int i1, int i2) {
        int temp = elems.get(i1);
        elems.set(i1, elems.get(i2));
        elems.set(i2, temp);
    }
}
