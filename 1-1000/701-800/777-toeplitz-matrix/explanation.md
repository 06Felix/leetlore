# Explanation

## Idea

- Compare each cell with its down-right neighbor.
- If any pair differs, the matrix is not Toeplitz.
- If all such pairs match, return `true`.

## Why It Works

- Every top-left to bottom-right diagonal is defined by repeated down-right moves.
- Checking adjacent cells along each diagonal is enough to ensure all values on that diagonal are equal.
- The loops cover every adjacent diagonal pair.

## Edge Cases

- A one-row or one-column matrix has no violating adjacent diagonal pair and returns `true`.
- Differences near any boundary are still detected by the previous in-bounds cell.
- The algorithm does not need extra storage.

## Complexity

- Time: $O(mn)$.
- Space: $O(1)$.
