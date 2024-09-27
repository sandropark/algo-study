package com.algo

fun solution(p: String): String {
    val sb: StringBuilder = StringBuilder()

    fun rec(s: String) {
        if (s.isEmpty()) return
        var openCount = 0
        var closedCount = 0

        for (i in s.indices) {
            val c = s[i]
            if (c == '(') openCount++
            if (c == ')') closedCount++

            when {
                (openCount == closedCount) -> {
                    val u = s.substring(0, i + 1)
                    val v = s.substring(i + 1)

                    if (u.startsWith('(')) {
                        sb.append(u)
                        rec(v)
                        return
                    }

                    sb.append('(')
                    rec(v)
                    sb.append(')').append(processU(u))
                    return
                }
            }
        }
    }

    rec(p)
    return sb.toString()
}

fun processU(s: String): String {
    return if (s.length == 2) "" else reverse(s.substring(1, s.length - 1))
}

fun reverse(s: String): String {
    return s.map { if (it == '(') ')' else '(' }.joinToString("")
}