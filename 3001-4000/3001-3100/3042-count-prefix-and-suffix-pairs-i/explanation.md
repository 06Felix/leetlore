# Explanation

## Idea
- Enumerate pairs with the second index strictly greater than the first.
- Count a pair when the later word both starts and ends with the earlier word.

## Why It Works
- The loop bounds enumerate every permitted index pair once.
- Combining `startsWith` and `endsWith` directly tests the two required conditions, including overlapping prefix and suffix positions.

## Edge Cases
- Equal words at different indices qualify.
- An earlier word longer than the later word cannot match; a one-word array has no pairs.

## Complexity
- Time: $O(n^2L)$ for maximum word length `L`.
- Auxiliary space: $O(1)$.

## Notes
- The `i == j` check is redundant because the inner loop starts at `i + 1`; it does not alter the result.
