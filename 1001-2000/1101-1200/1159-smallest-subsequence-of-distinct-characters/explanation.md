# Smallest Subsequence of Distinct Characters

## Idea

- Count remaining occurrences of every character.
- Build the answer as a monotonic stack in a `StringBuilder`.
- Skip characters already present in the answer.
- While the last chosen character is larger than the current one and appears later again, remove it.

## Why It Works

- Every distinct character must appear exactly once.
- Removing a larger previous character improves lexicographic order only if it can be added again later.
- `vis` prevents duplicate characters in the output.
- The greedy stack keeps the smallest possible prefix while preserving all required characters.

## Edge Cases

- Already increasing unique strings stay unchanged.
- Repeated characters are skipped after their first kept copy.
- If a larger character has no remaining copy, it cannot be removed.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ for fixed ASCII-sized arrays plus output.
