package com.algo.graph

class LeetCode17(private val map: Map<Char, List<Char>>) {
    fun solution(input: String): List<String> {
        val result: MutableList<String> = mutableListOf()

        fun dfs(index: Int, path: StringBuilder) {
            if (index == input.length) {
                result.add(path.toString())
                return
            }

            for (c in map[input[index]]!!)
                dfs(index + 1, StringBuilder(path).append(c))
        }

        dfs(0, StringBuilder())

        return result
    }
}


