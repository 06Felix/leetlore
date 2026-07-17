# Explanation

## Idea

- The implementation uses the known perfect numbers within the constraint `num <= 10^8`.
- It returns `true` only for `6`, `28`, `496`, `8128`, and `33550336`.
- Every other value is returned as `false`.

## Why It Works

- The problem input is bounded, and these are exactly the positive perfect numbers not exceeding `10^8`.
- A direct membership check is therefore equivalent to summing divisors for this constraint range.
- Since the function only compares constants, there is no divisor iteration or overflow risk.

## Edge Cases

- `1` is not in the list, so it correctly returns `false`.
- Prime numbers and non-perfect composites are rejected by the constant checks.
- `33550336`, the largest relevant perfect number under the constraint, is included.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.

## Notes

- This solution depends on the current constraint upper bound. A larger bound would require adding more known perfect numbers or switching to divisor-sum logic.
