# Explanation

## Idea

- Count the number of `1`s in every row and column.
- For each cell containing `1`, treat it as the right-angle corner.
- Add `(rowCount - 1) * (colCount - 1)` possible triangles from that corner.

## Why It Works

- A valid right triangle needs one other `1` in the same row and one other `1` in the same column.
- For a corner cell, there are `rowCount - 1` row choices and `colCount - 1` column choices.
- Multiplying those independent choices counts all triangles with that corner.

## Edge Cases

- Rows or columns with only one `1` contribute zero.
- A grid with no possible corner returns `0`.
- `long` is used because the count can exceed `int`.

## Complexity

- Time: $O(mn)$.
- Space: $O(m + n)$.
