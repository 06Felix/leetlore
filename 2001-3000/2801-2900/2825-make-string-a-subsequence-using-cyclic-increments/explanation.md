# Explanation

## Idea
- Scan the source once, matching the next target character against either the current letter or its cyclic successor.
- Advance the target pointer on a match and return true immediately when all target characters are matched.

## Why It Works
- Matching at the earliest compatible source position leaves the largest possible suffix for future matches.
- Each selected position can independently stay unchanged or increase once, and all chosen increments belong to the single allowed set operation.

## Edge Cases
- The cyclic expression maps `z` to `a`.
- The target is nonempty, and immediate return after its final match prevents indexing beyond it.

## Complexity
- Time: $O(n)$ for source length `n`.
- Auxiliary space: $O(n)$ for the actual `toCharArray()` call.
