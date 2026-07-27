# Explanation

Problem: [Maximum Number of Points with Cost](https://leetcode.com/problems/maximum-number-of-points-with-cost/)

## Idea

- Keep `dp[j]` as the best score after the previous row if column `j` was chosen.
- For each row, do a left-to-right pass carrying the best previous score after paying movement cost.
- Do a right-to-left pass for movement from the other direction.
- The best prior score for current column `j` is `max(ltr[j], rtl[j])`.
- Add the current cell value to build the next `dp`.

## Why It Works

- Moving from previous column `p` to current column `j` contributes `dp[p] - |p - j|`.
- The left-to-right pass computes the best value among `p <= j`, decreasing by one per column moved.
- The right-to-left pass computes the best value among `p >= j` by the same rule.
- Taking the maximum of both passes covers every possible previous column.
- Adding `points[row][j]` then gives the optimal score ending at column `j` for the current row.

## Complexity

- Time: $O(mn)$.
- Space: $O(n)$.

## Notes

- The implementation uses `long` because scores can exceed `int`.
