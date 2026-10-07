# Explanation

## Idea
- Store each value with its original index and sort these pairs by value.
- Scan the sorted pairs, skipping marked indices; add each selected value and mark it and its existing neighbors.

## Why It Works
- Java's object-array sort is stable, so equal values retain their original increasing-index order even though the comparator only checks values.
- The first unmarked pair is therefore exactly the next element required by the rules. Marking uses original indices, preserving adjacency after sorting.

## Edge Cases
- Equal values are selected from left to right unless a prior selection already marked them.
- At either end of the array, only the existing neighbor is marked.

## Complexity
- Time: $O(n \log n)$ for sorting and $O(n)$ for the marking pass.
- Auxiliary space: $O(n)$ for pairs, marking flags, and sorting storage.

## Notes
- The score uses `long`, since the sum can exceed the `int` range under the constraints.
