# Explanation

Problem: [Path with Maximum Gold](https://leetcode.com/problems/path-with-maximum-gold/)

## Idea

Try starting a DFS from every cell. During DFS, temporarily set the current cell to `0` to mark it visited, explore all four directions, then restore the original gold value.

## Why It Works

A valid path cannot enter a zero cell or revisit a cell. The base case rejects out-of-bounds cells and cells currently equal to `0`, so every explored path is valid. Marking a visited gold cell as `0` prevents cycles within the current path, and restoring it allows other starting paths to use the cell. From each cell, the best path is its gold plus the best continuation among the four neighbors. Taking the maximum over all starting cells gives the globally maximum collectable gold.

## Edge Cases

- Starting from a zero cell returns `0`.
- Isolated gold cells are considered because every cell is tried as a start.

## Complexity

- Time: `O(g * 3^g)` in the worst case, where `g` is the number of gold cells.
- Space: `O(g)` recursion stack.
