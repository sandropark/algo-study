package com.algo;

public class Prog_괄호변환 {
    public String solution(String p) {
        StringBuilder sb = new StringBuilder();
        rec(p, sb);
        return sb.toString();
    }

    private static void rec(String s, StringBuilder sb) {
        if (s.isEmpty()) return;
        int openCount = 0;
        int closeCount = 0;

        // 1. 문자열 순회
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 2. 앞,뒤 개수 세기
            if (c == '(') openCount++;
            if (c == ')') closeCount++;
            // 3. 앞,뒤 개수가 같아지면 문자열 분리
            if (openCount == closeCount) {
                String u = s.substring(0, i + 1);
                String w = s.substring(i + 1);

                if (isCorrect(u)) {
                    sb.append(u);
                    rec(w, sb);
                    // u, w 분리 후에는 재귀호출하면 되고 더 이상 반복문을 진행하면 안되기 때문에 반환.
                    return;
                }

                sb.append("(");
                rec(w, sb);
                sb.append(")").append(processU(u));
                // u, w 분리 후에는 재귀호출하면 되고 더 이상 반복문을 진행하면 안되기 때문에 반환.
                return;
            }
        }
    }

    private static boolean isCorrect(String s) {
        return s.startsWith("(");
    }

    public static String processU(String s) {
        if (s.length() == 2) return "";
        return reverse(s.substring(1, s.length() - 1));
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            sb.append(c == '(' ? ')' : '(');
        return sb.toString();
    }
}
