# Explanation

## Idea

- Use dynamic programming by row and the two robot columns.
- `dp[x][y1][y2]` stores the best cherries collectable from row `x` onward when the robots are at columns `y1` and `y2`.
- Fill rows from bottom to top so the next-row states are already known.

## Why It Works

- For a fixed row and pair of columns, the current reward is both cells, counting it once if both robots overlap.
- Each robot has only three possible next columns, so all valid next state pairs can be tried directly.
- Taking the maximum over those next states gives the optimal continuation for the current state.
- The answer starts from row `0`, columns `0` and `n - 1`.

## Edge Cases

- Overlapping robot positions count the grid cell once.
- Boundary columns are handled by clamping the next-column loops.
- The extra row `dp[m]` acts as a zero-value base case after the last row.

## Complexity

- Time: $O(mn^2 \cdot 9)$, simplified to $O(mn^2)$.
- Space: $O(mn^2)$.
