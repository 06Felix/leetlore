# 2267. Check if There Is a Valid Parentheses String Path

## Idea

- Track the number of opening parentheses that still need a matching closing one. Call this the **balance**: `(` adds 1, and `)` subtracts 1. For example, `(())` has balances `1, 2, 1, 0`.
- A valid path never has a negative balance and finishes at zero. Different paths to the same cell can have different balances, so we keep every reachable balance.
- Every path visits `m + n - 1` cells. Reject an odd path length, a starting `)`, or an ending `(` immediately.

## How the DP Works

- Process cells from left to right, one row at a time. Before updating a cell, `dp[j][bal]` represents a path arriving from above. If `j > 0`, `dp[j - 1][bal]` represents one arriving from the left, since that column has already been updated for this row.
- Start with `dp[0][0] = true`. This represents the empty path just before entering the starting cell; its character is still processed normally.
- For each incoming balance, apply the current character and store the result in a fresh `curr` array. Reject negative balances. Also reject a balance larger than `remain`, the number of cells still to visit: even if every remaining character were `)`, it could not close everything.
- Replace `dp[j]` with `curr` after processing the cell. At the bottom-right corner, return whether balance zero is reachable.

## Why It Works

- Any path reaching a cell must come from above or from the left. The transition checks both, so it covers every possible path.
- Paths reaching the same cell with the same balance have identical options ahead. Keeping a boolean for that balance is enough; we do not need to remember the actual paths.
- A negative balance means a closing parenthesis has no opening match. Too many unmatched openings to close in the remaining cells is also impossible. Neither discarded state can lead to a valid answer.
- A reachable balance of zero at the destination therefore describes a complete path whose parentheses are valid.

## Edge Cases

- A single cell cannot form a valid parentheses string; the odd-length check rejects it.
- A single row or column works the same way, with only one possible path.
- Having equal counts of `(` and `)` is not enough. A path such as `())(()` is rejected when its balance becomes negative.

## Complexity

- **Time:** $O(mn(m+n))$. Each cell checks at most `m + n - 1` incoming balances.
- **Auxiliary space:** $O(n(m+n))$. The DP stores one row of balance arrays, plus one temporary array for the current cell.

## Tags

- Dynamic Programming
- Matrix
- Array
