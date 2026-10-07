# Explanation

## Idea
- Scan the permutation while tracking the maximum value seen so far.
- Count a chunk boundary whenever that maximum equals the current index.

## Why It Works
- A prefix ending at index `i` contains `i + 1` distinct values. If its maximum is `i`, those values must be exactly `0` through `i`.
- Such a prefix can be sorted independently of the suffix. Cutting at every valid boundary maximizes the number of chunks.

## Edge Cases
- An already sorted permutation permits one chunk per element.
- A descending permutation of length greater than one permits only the final boundary.

## Complexity
- Time: $O(n)$ for one scan.
- Auxiliary space: $O(1)$.

## Notes
- The maximum-equals-index criterion relies on the stated permutation restriction.
