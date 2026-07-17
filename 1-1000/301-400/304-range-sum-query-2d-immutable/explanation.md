# Range Sum Query 2D - Immutable

## Idea

- The constructor builds a 2D prefix-sum table `dp` with one extra row and column.
- `dp[i][j]` stores the sum of the rectangle from `(0, 0)` to `(i - 1, j - 1)`.
- `sumRegion` uses inclusion-exclusion to subtract areas above and left of the query rectangle.
- The extra border avoids special cases for row or column zero.

## Why It Works

- A prefix rectangle can be built from the top prefix, left prefix, and current cell, subtracting the double-counted top-left prefix.
- Any query rectangle can be represented as one large prefix minus the prefixes outside it.
- Adding back `dp[row1][col1]` restores the overlap subtracted twice.

## Edge Cases

- Single-cell queries work through the same inclusion-exclusion formula.
- Queries touching the top or left edge use the zero border.
- Negative matrix values are safe because sums are additive.

## Complexity

- Construction time: $O(mn)$.
- Query time: $O(1)$.
- Space: $O(mn)$.
