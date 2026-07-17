# Teemo Attacking

## Idea

- The solution sums the effective poisoned duration between consecutive attacks.
- For each attack except the last, it adds the smaller of `duration` and the gap to the next attack.
- The final attack always contributes `duration`.
- If `duration` is zero, the answer is zero immediately.

## Why It Works

- A later attack before the poison expires overlaps and resets the timer.
- The non-overlapping contribution of an attack before the next one is limited by the time gap.
- If the next attack comes after the duration, the full duration counts.
- Adding the final full duration accounts for the last poison interval.

## Edge Cases

- One attack returns `duration`.
- Overlapping attacks count only the uncovered seconds.
- `duration = 0` returns `0`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
