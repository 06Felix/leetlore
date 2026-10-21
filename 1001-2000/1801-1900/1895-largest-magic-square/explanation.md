# Largest Magic Square

## Idea
- Precompute horizontal, vertical, and both diagonal prefix sums in padded arrays.
- Try square sizes from largest to smallest at every valid top-left position. Use the first row sum as a target and compare every other row, every column, and both diagonals.
- Return the first successful size, or one if no larger magic square exists.

## Why It Works
- Prefix-sum differences give each candidate segment's exact sum without rescanning its cells.
- Checking all rows, columns, and both diagonals is exactly the magic-square condition.
- Sizes are tried in descending order, so the first valid candidate is globally largest; every one-cell square is valid.

## Edge Cases
- Single-row or single-column grids return one.
- Repeated values are permitted. Padded borders support diagonal differences at every edge without special cases.

## Complexity
- $O(mnK^2)$ worst-case time for $K=\min(m,n)$: at most $O(mn)$ candidates per size, each checked in $O(size)$ time.
- $O(mn)$ auxiliary space for four prefix-sum arrays; the input is unchanged.

## Notes
- Each stored segment has at most 50 values of at most $10^6$, so prefix sums fit in `int`.
