# Explanation

Problem: [Equal Row and Column Pairs](https://leetcode.com/problems/equal-row-and-column-pairs/)

## Idea

Compare every row with every column directly. For each pair, scan all positions and count it if every value matches.

## Why It Works

A row `i` and column `j` are equal exactly when `grid[i][k] == grid[k][j]` for every index `k`. The inner loop checks that condition and stops early on the first mismatch. If it reaches `k == n`, all positions matched, so the pair is valid and the answer is incremented. Since every row-column pair is tested, the final count is complete.

## Edge Cases

- Duplicate rows or columns are counted as separate pairs, as required.
- A `1 x 1` grid has one matching row-column pair.

## Complexity

- Time: `O(n^3)`.
- Space: `O(1)`.
