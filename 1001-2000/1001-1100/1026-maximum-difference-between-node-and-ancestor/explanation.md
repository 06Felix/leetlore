# Explanation

## Idea
- Recursively visit each node while carrying the minimum and maximum values on its ancestor path.
- Compare its value against both extrema, update the result field, then extend the extrema before visiting its children.

## Why It Works
- The greatest absolute difference from any ancestor is attained at one of the ancestor path's minimum or maximum values.
- Every node is compared with those extrema, covering all eligible ancestor-descendant pairs without comparing nodes from separate branches.

## Edge Cases
- Initializing both extrema to the root value makes the root contribute zero.
- Equal node values produce zero differences; each recursive branch receives its own path extrema.

## Complexity
- Time: $O(n)$, visiting each node once.
- Auxiliary space: $O(h)$ for recursion height `h`, up to $O(n)$ for a skewed tree.

## Notes
- The result field is initialized when the object is created and is not reset in `maxAncestorDiff`. Reusing the same `Solution` object for another tree can return a stale larger result.
- A skewed tree near the 5000-node limit risks overflowing Java's recursion stack. The existing implementation is preserved.
