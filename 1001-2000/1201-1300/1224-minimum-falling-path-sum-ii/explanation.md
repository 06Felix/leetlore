# Explanation

## Idea

- Process rows from top to bottom, modifying `grid` in place as DP.
- For the previous row, find the smallest and second-smallest accumulated sums.
- For each cell, add the smallest previous sum unless it comes from the same column; then add the second-smallest.

## Why It Works

- A falling path cannot choose the same column in adjacent rows.
- The best predecessor for a cell is the minimum value in the previous row outside its column.
- Keeping the two smallest previous values is enough to answer that query for every column.

## Edge Cases

- A `1 x 1` grid returns its only value.
- Negative values are handled by the same minimum comparisons.
- The implementation mutates `grid`, which is fine for this submitted solution.

## Complexity

- Time: $O(n^2)$.
- Space: $O(1)$ extra.
