# Explanation

## Idea

- First check whether `r * c` equals the original element count.
- If not, return the original matrix.
- Otherwise, scan the original matrix row by row and place each value at index `i / c, i % c` in the new matrix.

## Why It Works

- Reshaping is legal only when the total number of cells stays the same.
- A single counter `i` preserves row-major order across both matrices.
- For the target shape, `i / c` gives the row and `i % c` gives the column.

## Edge Cases

- Illegal target dimensions return `mat` unchanged.
- Single-row and single-column reshapes work through the same index mapping.
- The empty-matrix guard is harmless, though constraints already give non-empty input.

## Complexity

- Time: $O(mn)$.
- Space: $O(rc)$ for the reshaped matrix when reshape is possible.
