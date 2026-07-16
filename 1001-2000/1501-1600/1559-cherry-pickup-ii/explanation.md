# Cherry Pickup II

## Idea

- The DP state `dp[x][y1][y2]` stores the best cherries collectable starting at row `x` with robots in columns `y1` and `y2`.
- The code fills rows bottom-up from the last row toward the first.
- For each pair of robot columns, it adds the cherries on the current row, counting a shared cell only once.
- It then tries all next-column choices within one step for both robots.

## Why It Works

- Both robots move down one row at each step, so the row number is shared.
- Given `(x, y1, y2)`, the future depends only on the next row and the two next columns.
- Trying all valid moves for both robots includes the optimal continuation.
- Bottom-up filling ensures `dp[x + 1][d1][d2]` is available before computing `dp[x][y1][y2]`.

## Edge Cases

- When both robots occupy the same cell, its cherries are added once.
- Boundary columns restrict next moves with `Math.max` and `Math.min`.
- The answer starts from the required initial columns `0` and `n - 1`.

## Complexity

- Time: $O(mn^2 \cdot 9)$, usually written as $O(mn^2)$.
- Space: $O(mn^2)$.
