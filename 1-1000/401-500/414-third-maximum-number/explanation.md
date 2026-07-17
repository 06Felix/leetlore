# Explanation

## Idea

- Track the largest three distinct values in `a`, `b`, and `c`.
- Ignore values already equal to a higher tracked value.
- Return `c` if a third distinct maximum exists; otherwise return `a`.

## Why It Works

- When a new largest value appears, the previous first and second maxima shift down.
- When a value fits between first and second, or second and third, the lower tracked values update accordingly.
- Using `Long.MIN_VALUE` as a sentinel avoids collision with valid `int` values.

## Edge Cases

- Duplicate values do not occupy multiple maximum slots.
- If fewer than three distinct values exist, `c` stays at the sentinel.
- `Integer.MIN_VALUE` is handled because the sentinel is a `long` below all `int` values.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
