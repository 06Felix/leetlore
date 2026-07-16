# Out of Boundary Paths

## Idea

- The solution uses step-by-step dynamic programming over the grid.
- `dp[i][j]` stores how many paths are currently at cell `(i, j)` before the next move.
- For each move, it creates `newDp` for paths that remain inside the grid.
- Moves that cross a boundary are added directly to `ans`.

## Why It Works

- Every path of length up to `maxMove` advances one move at a time.
- Distributing each cell's count to its four neighbors accounts for every possible next move.
- Once a move leaves the grid, that path is complete and should not be moved again.
- Replacing `dp` with `newDp` after each layer ensures exactly one move is processed per iteration.

## Edge Cases

- `maxMove = 0` returns `0` because no moves can leave the grid.
- One-row or one-column grids naturally count multiple boundary directions.
- Modulo is applied during accumulation to keep counts bounded.

## Complexity

- Time: $O(\text{maxMove} \cdot m \cdot n)$.
- Space: $O(mn)$.
