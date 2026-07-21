# Pass the Pillow

## Idea

- The pillow movement repeats every `2 * (n - 1)` seconds.
- Reduce `time` by that cycle length.
- If the reduced time is before reaching person `n`, move forward from person `1`.
- Otherwise, move backward from person `n`.

## Why It Works

- A full trip from `1` to `n` and back to `1` takes `2 * (n - 1)` passes.
- After modulo, only the position inside the current cycle matters.
- Times `0` through `n - 1` map to people `1` through `n`.
- The backward half maps to `2 * n - time - 1`.

## Edge Cases

- `time` exactly at the end of the forward trip returns `n`.
- Full cycles return to person `1`.
- The constraints ensure `n >= 2`, so cycle length is positive.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
