# Longest Increasing Path in a Matrix

## Idea

- Run DFS from every cell.
- `mem[i][j]` caches the longest increasing path starting at cell `(i, j)`.
- A DFS can move only to neighbors with values greater than the current cell.
- Take the maximum cached DFS result over all cells.

## Why It Works

- Increasing paths form an acyclic search by value, so memoized DFS is valid.
- The best path from a cell is `1 + max(best neighbor path)`.
- If a neighbor is out of bounds or not greater, it contributes `0`.
- Caching avoids recomputing the same cell's best path from different starts.

## Edge Cases

- A `1 x 1` matrix returns `1`.
- Equal adjacent values cannot be used because movement must be strictly increasing.
- `Integer.MIN_VALUE` as the initial previous value allows every non-negative cell to start.

## Complexity

- Time: $O(mn)$ after memoization.
- Space: $O(mn)$ for memo plus recursion stack.
