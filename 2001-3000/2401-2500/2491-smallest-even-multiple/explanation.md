# Smallest Even Multiple

## Idea

- If `n` is even, it is already divisible by both `n` and `2`.
- If `n` is odd, the smallest number divisible by both is `2 * n`.
- The expression `(n % 2 + 1) * n` encodes those two cases.

## Why It Works

- For even `n`, `n % 2` is `0`, so the expression returns `n`.
- For odd `n`, `n % 2` is `1`, so the expression returns `2 * n`.
- No smaller positive multiple can work in either case: even `n` itself is minimal, while odd `n` must be doubled to become even.

## Edge Cases

- `n = 1` returns `2`.
- Already-even values such as `2`, `6`, or `150` return unchanged.
- The constraints are small, so there is no overflow risk.

## Complexity

- Time: `O(1)`.
- Space: `O(1)`.
