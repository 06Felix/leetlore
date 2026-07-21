# Shift 2D Grid

## Idea

- Treat the matrix as a flattened array of length `m * n`.
- Reduce `k` modulo that length.
- For each original cell `(i, j)`, compute its flattened index after shifting.
- Write the value into the corresponding output row and column, then convert rows to lists.

## Why It Works

- One shift moves every flattened index forward by one modulo total cell count.
- Applying `k` shifts moves index `idx` to `(idx + k) % total`.
- Converting the shifted flat index back with division and modulo gives the target cell.
- Every original cell maps to exactly one output cell.

## Edge Cases

- `k = 0` or a multiple of total cells returns the original layout.
- Single-row and single-column grids follow the same flattened mapping.
- Negative values are copied unchanged.

## Complexity

- Time: $O(mn)$.
- Space: $O(mn)$ for the output matrix and result lists.
