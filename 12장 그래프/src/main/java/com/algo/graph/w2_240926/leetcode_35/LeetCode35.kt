package com.algo.graph.w2_240926.leetcode_35

fun solution(grid: Array<CharArray>): Int {
    var count = 0

    fun dfs(rowIndex: Int, colIndex: Int): Boolean {
        when {
            (rowIndex < 0) ||
                    rowIndex >= grid.size ||
                    colIndex < 0 ||
                    colIndex >= grid[0].size ||
                    grid[rowIndex][colIndex] != '1' -> return false
        }
        grid[rowIndex][colIndex] = 'v'
        dfs(rowIndex - 1, colIndex)
        dfs(rowIndex + 1, colIndex)
        dfs(rowIndex, colIndex - 1)
        dfs(rowIndex, colIndex + 1)
        return true
    }

    for (rowIndex in grid.indices)
        for (colIndex in grid[rowIndex].indices)
            if (dfs(rowIndex, colIndex)) count++

    return count
}
