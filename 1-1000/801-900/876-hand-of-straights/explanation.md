# Hand of Straights

## Idea

- Count card values in a `TreeMap` so values are processed from smallest to largest.
- For each smallest remaining value `start`, read its count `v`.
- If `v > 0`, start `v` groups there and subtract `v` from every value in `[start, start + k - 1]`.
- Return `false` as soon as a needed value count becomes negative.

## Why It Works

- The smallest remaining card cannot be placed after any smaller card, so it must begin every group that uses it.
- If there are `v` copies of `start`, exactly `v` consecutive groups must start at `start`.
- Subtracting `v` from the whole required window commits those forced groups.
- If every forced window is available, all cards can be partitioned into consecutive groups.

## Edge Cases

- Missing a required card inserts or updates a negative count and immediately fails.
- `groupSize = 1` succeeds because each card is a complete group.
- Duplicate card values are handled by subtracting the full remaining count at once.

## Complexity

- Time: $O(n \log m + mk \log m)$ for `n` cards and `m` distinct values.
- Space: $O(m)$ for the frequency map.
