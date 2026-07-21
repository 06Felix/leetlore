# Convert to Base -2

## Idea

- Repeatedly take the low bit `n & 1` as the next base `-2` digit.
- Append digits in reverse order.
- Update `n` with `n = -(n >> 1)`.
- Reverse the built digits at the end, or return `"0"` for input `0`.

## Why It Works

- Base `-2` digits are still binary digits, so the remainder modulo `2` is `0` or `1`.
- After removing the low bit, dividing by `-2` gives the next quotient.
- For non-negative `n`, `n & 1` and `-(n >> 1)` implement that quotient progression.
- Reversing restores most-significant to least-significant digit order.

## Edge Cases

- `n = 0` returns `"0"`.
- Odd values append `1`; even values append `0`.
- The loop terminates as repeated negative-base division reaches zero.

## Complexity

- Time: $O(\log n)$.
- Space: $O(\log n)$ for the output digits.
