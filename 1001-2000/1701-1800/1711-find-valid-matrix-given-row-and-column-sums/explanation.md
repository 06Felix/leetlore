# Explanation

Problem: [Find Valid Matrix Given Row and Column Sums](https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/)

## Idea

- Build the matrix greedily with two pointers: one row and one column.
- At each cell, place `min(rowSum[i], colSum[j])`.
- Subtract that value from both remaining sums.
- Move to the next row or column when its remaining sum becomes zero.

## Why It Works

- Placing the smaller remaining requirement never overshoots either the current row or column.
- After the placement, at least one of the current row or column is fully satisfied, so progress is guaranteed.
- The total row sum equals the total column sum by the problem guarantee, so satisfying rows and columns greedily exhausts both sides together.
- Every assigned value is non-negative, and each row/column total is preserved by subtracting exactly what was placed.

## Edge Cases

- Rows or columns with zero remaining sum are skipped as soon as they are exhausted.
- A `1 x n` or `m x 1` matrix works with the same pointer logic.

## Complexity

- Time: $O(m + n)$ placements after allocating the matrix.
- Space: $O(mn)$ for the returned matrix.

## Notes

- The implementation mutates the input `rowSum` and `colSum` arrays while constructing the answer.
