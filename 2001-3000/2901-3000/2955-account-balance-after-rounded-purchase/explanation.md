# Account Balance After Rounded Purchase

## Idea

- The solution divides the purchase amount by `10.0`.
- `Math.round` rounds that quotient to the nearest integer, with halves rounded up.
- Multiplying by `10` gives the rounded purchase amount.
- The final balance is `100 - roundedAmount`.

## Why It Works

- Rounding to the nearest multiple of `10` is equivalent to rounding `purchaseAmount / 10` to the nearest integer and scaling back.
- Java's `Math.round` handles `.5` by rounding upward for these non-negative values.
- Subtracting the rounded amount from `100` matches the account balance rule.

## Edge Cases

- `0` rounds to `0`, leaving the balance at `100`.
- Exact multiples of `10` remain unchanged.
- Amounts ending in `5` round up to the next multiple of `10`.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
