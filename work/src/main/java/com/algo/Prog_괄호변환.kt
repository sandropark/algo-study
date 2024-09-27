package com.algo

fun solution(p: String): String {
    if (p.isEmpty()) return p

    var (openCount, closeCount) = 0 to 0

    for (i in p.indices) {
        when (p[i]) {
            '(' -> openCount++
            ')' -> closeCount++
        }
        if (openCount == closeCount) {
            val u = p.substring(0, i + 1)
            val w = p.substring(i + 1)

            return if (isCorrect(u))
                u + solution(w)
            else
                "(${solution(w)})${processU(u)}"
        }
    }
    return ""
}

fun isCorrect(s: String): Boolean {
    return s.startsWith("(")
}

fun processU(s: String): String {
    if (s.length == 2) return ""
    return reverse(s.substring(1, s.length - 1))
}

fun reverse(s: String): String {
    return s.map { if (it == '(') ')' else '(' }.joinToString("")
}
