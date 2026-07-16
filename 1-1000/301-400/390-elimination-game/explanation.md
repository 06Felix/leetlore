# Elimination Game

## Idea

- The implementation uses the recurrence for the last remaining number after the first left-to-right deletion.
- After removing every odd-positioned value from `1..n`, the remaining list is `[2, 4, 6, ...]`.
- Dividing those values by `2` gives a smaller game of size `n / 2`, but the next deletion direction is reversed.
- The expression `2 * (1 + n / 2 - lastRemaining(n / 2))` mirrors the smaller result back into the original even-valued list.

## Why It Works

- Every first pass leaves only even numbers, so the final answer must be twice some position in the compressed list.
- Reversing direction on the next round means the survivor's compressed position is the mirror of the smaller game's survivor.
- `1 + n / 2 - lastRemaining(n / 2)` performs that mirror transform for positions `1..n/2`.
- The base case `n == 1` returns the only possible survivor.

## Edge Cases

- `n = 1` stops immediately.
- Both even and odd `n` work because `n / 2` is exactly the count of remaining even values.
- Large `n` is safe because recursion depth is only logarithmic.

## Complexity

- Time: $O(\log n)$.
- Space: $O(\log n)$ recursion stack.
