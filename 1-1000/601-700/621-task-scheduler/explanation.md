# Explanation

## Idea

- Count how often each task appears.
- Let `mF` be the maximum frequency, and `mFc` be how many task types have that frequency.
- Compute the frame length `(mF - 1) * (n + 1) + mFc`, then compare it with `tasks.length`.

## Why It Works

- The most frequent tasks create `mF - 1` gaps that must each have size at least `n` between repeats.
- Tasks tied at maximum frequency occupy the final positions of those frames.
- Other tasks can fill idle slots; if there are enough tasks, the answer is just the total task count.

## Edge Cases

- `n = 0` returns `tasks.length`.
- Multiple most frequent task types are handled by `mFc`.
- When idle time is unnecessary, the `max` with `tasks.length` prevents undercounting.

## Complexity

- Time: $O(t + 26)$.
- Space: $O(26)$.
