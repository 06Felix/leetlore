# Guess Number Higher or Lower

## Idea

- Binary search the answer range.
- Keep `l` as the smallest possible answer and `r` as the largest possible answer.
- For midpoint `m`, if `guess(m) <= 0`, the pick is at most `m`, so move `r` down.
- Otherwise, the pick is greater than `m`, so move `l` up.

## Why It Works

- The API tells whether the hidden number is lower, equal, or higher than the guess.
- When the guess is too high or correct, every value above `m` can be discarded.
- When the guess is too low, every value up to `m` can be discarded.
- The loop ends when only one possible value remains.

## Edge Cases

- `n = 1` returns `1`.
- The midpoint uses `l + (r - l) / 2`, avoiding overflow.
- Starting with `l = 0` is harmless because the search converges into the valid range before returning.

## Complexity

- Time: $O(\log n)$ API calls.
- Space: $O(1)$.
