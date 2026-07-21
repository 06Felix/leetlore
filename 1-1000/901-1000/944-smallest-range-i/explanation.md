# Smallest Range I

## Idea

- Find the minimum and maximum values in `nums`.
- Each value can move by at most `k`.
- The maximum can be reduced by `k`, and the minimum can be increased by `k`.
- Return the remaining gap, clamped at `0`.

## Why It Works

- Only the original minimum and maximum determine the starting range.
- The best possible range reduction is at most `2k`.
- If `mx - mn <= 2k`, all values can overlap into a common range, so score is `0`.
- Otherwise, the unavoidable score is `mx - mn - 2k`.

## Edge Cases

- A single element returns `0`.
- `k = 0` returns the original range.
- Duplicate values work because min and max are unchanged.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
