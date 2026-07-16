# Minimum Operations to Write the Letter Y on a Grid

## Idea

- The Python solution tries all ordered choices of values for the Y cells and non-Y cells.
- `numC(y, r)` counts changes needed if Y cells become `y` and the rest become `r`.
- A cell is part of the upper Y if it is on either diagonal at or above the center.
- A cell is part of the lower Y if it is in the center column below the center.

## Why It Works

- The final grid uses exactly two distinct values: one for Y cells and one for all other cells.
- There are only three possible cell values, so all six valid `(Y value, rest value)` assignments can be checked directly.
- For any fixed assignment, each mismatched cell independently costs one operation.
- Taking the minimum over all assignments gives the fewest changes.

## Edge Cases

- The center cell belongs to the Y through the diagonal checks.
- Odd `n` guarantees a single center row and center column.
- Values are limited to `0`, `1`, and `2`, matching the six explicit cases.

## Complexity

- Time: $O(n^2)$ for each constant number of assignments, so $O(n^2)$ overall.
- Space: $O(1)$.
