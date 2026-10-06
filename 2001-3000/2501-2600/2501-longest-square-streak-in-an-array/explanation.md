# Explanation

## Idea
- Record which values occur and which chain members have already been visited in boolean arrays.
- Try each present, unvisited starting value whose square is within 100000, then repeatedly follow present squared successors.
- Record a chain only when it has at least two members; otherwise leave the answer at `-1`.

## Why It Works
- Values are at least two, so a valid square chain strictly increases and duplicates cannot lengthen it.
- Any chain of length at least two begins at a value whose square fits within the allowed range.
- Processing starts in increasing order lets an earlier chain mark its suffix values; starting from an already visited suffix cannot improve the result.

## Edge Cases
- No present square successor gives `-1`.
- Repeated array values affect only presence, while a value with a missing predecessor can still begin its own chain.

## Complexity
- Time: $O(n + V)$ as an upper bound for marking values and visiting chains, including array initialization, where $V = 100000$.
- Auxiliary space: $O(V)$ for the two boolean arrays.

## Notes
- Squaring uses `int` and can overflow. The nonnegative guard alone does not reject positive overflow in general; the present value bound and reachable square values prevent a false positive here. Wider value bounds would need wider multiplication.
