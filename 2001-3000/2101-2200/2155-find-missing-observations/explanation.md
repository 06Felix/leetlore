# Explanation

## Idea

Compute the total sum required by the mean, subtract the known roll sum, and distribute the remaining sum across the missing `n` rolls.

Each missing roll starts at `reqSum / n`, and the remainder is spread by adding `1` to the first few rolls.

## Why It Works

The missing rolls must sum to `mean * (m + n) - knownSum`. If that required sum is below `n` or above `6n`, no valid dice rolls can produce it.

Otherwise, the base quotient and remainder distribution creates `n` integers whose sum is exactly the required sum, while each value stays between `1` and `6`.

## Edge Cases

- Impossible low or high sums return an empty array.
- Remainder distribution changes only the first `reqSum % n` positions.
- Multiple valid answers are allowed.

## Complexity

Time: `O(m + n)`.

Space: `O(n)` for the returned array.
