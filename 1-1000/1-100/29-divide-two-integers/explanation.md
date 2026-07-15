# Explanation

## Idea

- Promote `dividend` to `long` before division so `Integer.MIN_VALUE` is represented safely.
- Let Java perform the signed integer division, then clamp the result to the `int` range.
- Cast the bounded result back to `int`.

## Why It Works

- Java integer division truncates toward zero, matching the problem's required quotient.
- The `long` conversion prevents overflow while negating or dividing the minimum `int` value.
- The explicit bounds checks handle the only overflowing quotient case, such as `Integer.MIN_VALUE / -1`.

## Edge Cases

- `Integer.MIN_VALUE / -1` is clamped to `Integer.MAX_VALUE`.
- The sign of the result is handled by Java's signed division.

## Complexity

- Time: `O(1)`.
- Space: `O(1)`.

## Notes

- The implementation is correct for the numeric result, but it uses `/` directly. That violates the problem's explicit restriction against using the division operator; a compliant solution would use repeated doubling and subtraction.
