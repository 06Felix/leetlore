# Explanation

## Idea
- Follow each unvisited permutation chain and count its elements.
- Before advancing, replace the current array entry with `-1` as a visited marker, preserving its former next index in a local variable.
- Keep the maximum chain length and skip entries already marked.

## Why It Works
- A permutation decomposes into disjoint cycles: each index has exactly one incoming and one outgoing link.
- Starting from any member of an unvisited cycle visits the entire cycle before encountering a marker.
- Once a cycle is processed, all its members are marked, so later starts cannot count it again. The longest cycle equals the longest requested nesting set.

## Edge Cases
- Fixed points count as cycles of length one.
- Multiple cycles are evaluated independently; `-1` is a safe sentinel because original values are nonnegative.

## Complexity
- Time: $O(n)$ because each index is marked once.
- Auxiliary space: $O(1)$.

## Notes
- The implementation destroys the input permutation by replacing visited entries with `-1`.
