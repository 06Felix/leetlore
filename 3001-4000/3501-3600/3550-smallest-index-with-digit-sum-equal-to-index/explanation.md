# Smallest Index With Digit Sum Equal to Index

## Idea
- Scan indices in ascending order and compute each value's digit sum by repeated remainder and division by ten.
- Return the first matching index, or `-1` if none matches.

## Why It Works
- The helper extracts every decimal digit exactly once, producing the required sum.
- Ascending traversal guarantees the first successful index is the smallest.

## Edge Cases
- Zero has digit sum zero because the helper loop does not execute.
- Several matches still return only the earliest one; values containing internal zeros are handled naturally.

## Complexity
- Time: $O(nD)$ for maximum decimal digit count $D$, at most four here.
- Space: $O(1)$ auxiliary storage.
