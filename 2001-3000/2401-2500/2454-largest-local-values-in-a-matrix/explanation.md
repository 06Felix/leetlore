# Explanation

Problem: [Largest Local Values in a Matrix](https://leetcode.com/problems/largest-local-values-in-a-matrix/)

## Idea

For each possible top-left corner of a `3 x 3` window, scan the nine cells and store the maximum in the corresponding answer cell.

## Why It Works

The output position `ans[i][j]` must represent the `3 x 3` block spanning rows `i..i+2` and columns `j..j+2`. The nested loops enumerate exactly those nine cells and keep the largest value seen. Since every valid top-left corner from `0` to `n - 3` is processed, every output cell is filled with the required local maximum.

## Edge Cases

- For `n = 3`, the answer has size `1 x 1` and scans the whole grid once.
- Positive grid values make initializing `mx` from `grid[i][j]` safe.

## Complexity

- Time: `O(n^2)`, with a constant nine-cell scan per answer cell.
- Space: `O(n^2)` for the output matrix.
