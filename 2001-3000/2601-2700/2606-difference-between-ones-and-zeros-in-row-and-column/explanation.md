# Explanation

Problem: [Difference Between Ones and Zeros in Row and Column](https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/)

## Idea

- Count the number of ones in every row and every column.
- For each cell `(i, j)`, derive zero counts as `n - onesRow[i]` and `m - onesCol[j]`.
- Fill `ans[i][j]` with the required formula using those precomputed counts.

## Why It Works

- `onesRow[i]` and `onesCol[j]` store exactly the row and column one-counts used by the definition.
- Because each entry is binary, the zero-counts are the remaining row or column length after subtracting ones.
- The final nested loop applies the problem's formula independently to every cell.

## Edge Cases

- Works for single-row and single-column grids because row and column lengths are computed separately.
- All-zero or all-one grids are handled by the same count formula.

## Complexity

- Time: $O(mn)$.
- Space: $O(m + n)$ beyond the returned matrix.
