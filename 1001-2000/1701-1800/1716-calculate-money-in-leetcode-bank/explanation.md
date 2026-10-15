# Calculate Money in Leetcode Bank

## Idea

- Split n into q full weeks and r remaining days. Add 28q, the weekly increases 7q(q - 1)/2, and the partial-week sum r(2q + r + 1)/2.

## Why It Works

- Week j (zero-based) contributes 28 + 7j. The remaining deposits are q + 1 through q + r, so arithmetic-series formulas count every day exactly once.

## Edge Cases

- Multiples of seven have no partial week; n < 7 uses only the final term.

## Complexity

- O(1) time and space.

## Notes

- All intermediate values fit int for n <= 1000.
