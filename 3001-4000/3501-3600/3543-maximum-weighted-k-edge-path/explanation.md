# Maximum Weighted K-Edge Path

## Idea
- Store reachable weight sums as bitsets for each ending node, with weight zero initially reachable at every node.
- For each of exactly `k` layers, inspect incoming edges, discard predecessor sums that would reach `t`, shift the survivors by the edge weight, and OR them into the destination.
- Scan final sums downward to return the largest reachable sum below `t`.

## Why It Works
- A transition extends a path from the previous layer by exactly one directed edge, so layer `i` represents precisely paths with `i` edges.
- Cropping to predecessor sums less than `t - weight` enforces the strict threshold. Positive weights mean discarded sums can never become valid later.
- Separate current and previous layers prevent a path from taking multiple edges within one iteration; starting at every node allows arbitrary path origins.

## Edge Cases
- `k = 0` returns zero because a zero-edge path exists at every node.
- No qualifying path returns `-1`; an edge of weight at least `t` is skipped. The manual shift moves bits to higher positions by scanning source positions in descending order, avoiding overwriting unread bits.

## Complexity
- Time: $O(n+m+k(n\lceil t/64\rceil+mt)+nt)$ as a worst-case bound; the manual bit shift visits individual bit positions, not merely machine words.
- Space: $O(n\lceil t/64\rceil+n+m)$ for two bitset layers and incoming adjacency, plus one temporary bitset.

## Notes
- The DAG guarantee ensures fixed-length directed walks are paths; no topological sort is needed for this layered DP.
- Bitsets are allocated with fixed initial capacity 601, matching the stated bound $t\le600$.
