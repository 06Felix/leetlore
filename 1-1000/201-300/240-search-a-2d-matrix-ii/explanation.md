# Explanation

Problem: [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/)

## Idea

- Start at the top-right cell.
- If the current value equals `target`, return true.
- If it is smaller than `target`, move down to a larger row value.
- If it is larger than `target`, move left to a smaller column value.

## Why It Works

- At the top-right corner, everything below is greater or equal and everything left is smaller or equal.
- When the current value is less than `target`, no value to its left in that row can match, so discarding the row is safe.
- When the current value is greater than `target`, no value below it in that column can match, so discarding the column is safe.
- Each move removes one row or column while preserving all still-possible positions.

## Edge Cases

- Single-row and single-column matrices work with the same boundary checks.
- Targets outside the matrix range eventually move out of bounds and return false.

## Complexity

- Time: $O(m + n)$.
- Space: $O(1)$.

## Notes

- The implementation relies on both row-wise and column-wise sorted order.
