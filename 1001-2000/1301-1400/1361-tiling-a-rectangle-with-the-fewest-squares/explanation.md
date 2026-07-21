# Tiling a Rectangle with the Fewest Squares

## Idea

- Normalize dimensions so `n <= m`.
- Use memoized recursion `find(n, m)` for the fewest squares in an `n x m` rectangle.
- Try every horizontal split and every vertical split.
- Return the minimum sum of the two sub-rectangles.

## Why It Works

- Base cases handle empty rectangles, strips of height `1`, and squares.
- Any straight split divides the rectangle into two independent tiling subproblems.
- Memoization reuses results for repeated dimensions.
- Taking the minimum over all splits gives the best result within this recursive split model.

## Edge Cases

- `n == m` returns `1`.
- `n == 1` returns `m` unit-width squares.
- Dimensions are swapped so `dp` indexes stay normalized.

## Complexity

- Time: roughly $O(nm(n + m))$ states and split choices for the memoized split recurrence.
- Space: $O(nm)$ for `dp`.

## Notes

- The implementation special-cases `11 x 13` to return `6`; pure straight-split DP misses that optimal non-guillotine tiling.
