# Missing Number

## Idea

- The solution sums all values present in `nums`.
- The full range `0..n` should sum to `n * (n + 1) / 2`.
- The missing value is the expected sum minus the actual sum.

## Why It Works

- The input contains every number in `0..n` except one.
- Summing the complete range and subtracting the observed values cancels every present number.
- The only value left after cancellation is the missing number.

## Edge Cases

- If `0` is missing, the actual sum equals the positive range sum and the subtraction returns `0`.
- If `n` is missing, the actual sum is short by exactly `n`.
- The constraints keep the arithmetic within `int`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
