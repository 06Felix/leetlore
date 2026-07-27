# Explanation

## Idea

The solution updates the matrix in place. For each cell, it adds the minimum reachable value from the previous row: directly above, above-left, or above-right.

After processing all rows, the answer is the minimum value in the last row.

## Why It Works

Any falling path ending at `(i, j)` must come from one of the three allowed cells in row `i - 1`. If each previous-row cell already stores the best path sum ending there, then adding the minimum of those choices gives the best path sum ending at `(i, j)`.

Processing from top to bottom ensures every needed previous state is ready before it is used.

## Edge Cases

- First and last columns have fewer predecessors, so the code checks bounds before reading them.
- A single-row matrix skips the update loop and returns the minimum from that row.

## Complexity

Time: `O(n^2)`.

Space: `O(1)` extra, because the input matrix stores the DP values.

## Notes

The implementation mutates the given matrix.
