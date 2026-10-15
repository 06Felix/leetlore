# Magic Squares In Grid

## Idea

- Try every 3-by-3 subgrid. Reject values outside 1 through 9 or duplicates, then compare all row, column, and diagonal sums against the first row sum.

## Why It Works

- Nine distinct entries drawn from 1 through 9 contain every required value exactly once. The subsequent checks enforce equal sums on all eight required lines, so passing is equivalent to being a magic square.

## Edge Cases

- Grids smaller than three in either dimension return zero. Values such as zero or ten are rejected before any line checks.

## Complexity

- O(rows * cols) time and O(1) auxiliary space; each candidate checks a fixed nine cells and eight lines.

## Notes

- The grid reference is stored for helper access, but entries are never modified.
