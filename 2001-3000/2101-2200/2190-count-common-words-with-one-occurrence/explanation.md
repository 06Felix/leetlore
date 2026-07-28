# Explanation

## Idea

Count occurrences from `words1` in a map. Then scan `words2` and decrement only words that exist in the map and still have count below `2`.

At the end, values equal to `0` are words seen exactly once in both arrays.

## Why It Works

A word that appears once in `words1` starts at count `1`. Seeing it once in `words2` decrements it to `0`, which marks a valid common once-only word.

If the same word appears again in `words2`, it decrements below `0`, so it no longer counts. Words appearing multiple times in `words1` start at `2` or more and are never decremented.

## Edge Cases

- Words absent from `words1` are ignored.
- Words repeated in either array do not end at `0`.
- The stream count converts the final valid-value count to `int`.

## Complexity

Time: `O(n + m)`.

Space: `O(n)`.
