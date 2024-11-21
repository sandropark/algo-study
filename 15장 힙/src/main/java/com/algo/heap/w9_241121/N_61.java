package com.algo.heap.w9_241121;

import java.util.Collections;
import java.util.LinkedList;

/*
프로그래머스 - 이중우선순위큐
 */
public class N_61 {
    public int[] solution(String[] operations) {
        LinkedList<Integer> q = new LinkedList<>();

        for (String operation : operations) {
            String[] split = operation.split(" ");
            String operator = split[0];
            int operand = Integer.parseInt(split[1]);

            if (operator.equals("I")) {
                q.add(operand);
                Collections.sort(q);
                continue;
            }

            if (operator.equals("D") && !q.isEmpty())
                if (operand == 1)
                    q.removeLast();
                else
                    q.removeFirst();
        }

        if (q.isEmpty())
            return new int[]{0, 0};

        return new int[]{q.getLast(), q.getFirst()};
    }
}
