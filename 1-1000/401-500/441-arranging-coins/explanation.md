# Arranging Coins

## Idea

- A complete staircase with `k` rows uses `k * (k + 1) / 2` coins.
- The solution solves this quadratic formula for `k`.
- It computes `(sqrt(8n + 1) - 1) / 2` and casts to `int`.

## Why It Works

- The largest complete row count is the greatest `k` such that `k(k + 1)/2 <= n`.
- Rearranging the inequality gives the positive root of `k^2 + k - 2n = 0`.
- Taking the integer part of the positive root gives the number of complete rows.

## Edge Cases

- Small values like `n = 1` return `1`.
- Incomplete final rows are discarded by integer truncation.
- The method accepts `long n`, avoiding overflow in `8 * n + 1`.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
