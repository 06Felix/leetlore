# Transpose Matrix

## Idea

- Read original dimensions as `n` rows and `m` columns.
- Allocate `ans` with `m` rows and `n` columns.
- For every output cell `(i, j)`, copy `matrix[j][i]`.
- Return the filled transposed matrix.

## Why It Works

- Transposition swaps row and column indices.
- The output dimensions must therefore be original columns by original rows.
- Assigning `ans[i][j] = matrix[j][i]` implements that swap for every cell.

## Edge Cases

- Square matrices keep the same dimensions.
- Rectangular matrices correctly swap shape.
- Negative values copy unchanged.

## Complexity

- Time: $O(mn)$.
- Space: $O(mn)$ for the returned matrix.
