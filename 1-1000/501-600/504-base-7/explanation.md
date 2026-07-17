# Base 7

## Idea

- The implementation delegates conversion to `Integer.toString(num, 7)`.
- The radix argument `7` asks Java to format the integer in base 7.
- Negative values are handled by the standard integer formatting behavior.

## Why It Works

- Base conversion repeatedly represents the number using powers of `7`.
- Java's radix conversion returns the same textual representation required by the problem.
- The sign is preserved for negative input.

## Edge Cases

- `0` converts to `"0"`.
- Negative numbers include a leading `-`.
- Values within the constraints fit in `int`.

## Complexity

- Time: $O(\log_7 |n|)$.
- Space: $O(\log_7 |n|)$ for the returned string.

## Notes

- The problem permits normal conversion logic; this submitted solution uses Java's library radix formatter directly.
