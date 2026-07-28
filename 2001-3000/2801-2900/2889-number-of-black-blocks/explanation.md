# Explanation

## Idea

Only `2 x 2` blocks near black cells can have a nonzero black count. For each black cell, increment the count for up to four block top-left positions containing it.

The map key encodes a block top-left coordinate.

## Why It Works

A black cell at `(x, y)` can belong only to blocks starting at `(x, y)`, `(x - 1, y)`, `(x, y - 1)`, and `(x - 1, y - 1)`, when those starts are inside the grid.

After processing every black cell, each mapped block stores exactly how many black cells it contains. Counting these frequencies fills answers for `1` through `4`.

All remaining blocks were never touched, so they contain zero black cells.

## Edge Cases

- Boundary black cells affect fewer than four blocks.
- `long` keys and counts are needed because the grid can be large.
- Distinct coordinates prevent double-counting the same black cell.

## Complexity

Time: `O(b)`, where `b` is the number of black cells.

Space: `O(b)`.
