# Explanation

## Idea

The solution uses one-dimensional dynamic programming. `dp[j]` stores the number of ways to reach the current row's cell in column `j`.

Every cell can be reached from above or from the left, so each update adds the current `dp[j]` value from the previous row to `dp[j - 1]` from the current row.

## Why It Works

The first row and first column each have only one possible path, so the array starts filled with `1`.

When processing row by row, `dp[j]` still represents paths from above, while `dp[j - 1]` already represents paths from the left in the same row. Adding them gives the total paths to that cell.

## Edge Cases

- If either dimension is `1`, the initialized array already gives answer `1`.
- The update loops start at row `1` and column `1`, preserving the first row and column base cases.

## Complexity

Time: `O(m * n)`.

Space: `O(n)`.
