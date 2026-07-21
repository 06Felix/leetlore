# Remove Max Number of Edges to Keep Graph Fully Traversable

## Idea

- Maintain separate Union-Find structures for Alice and Bob.
- Sort edges by type descending so shared type `3` edges are considered first.
- Use type `3` edges in both structures, type `1` only for Alice, and type `2` only for Bob.
- Count edges that actually connect at least one needed component, then remove the rest.

## Why It Works

- Shared edges are most valuable because one edge can help both Alice and Bob.
- A union that connects two existing components is required for connectivity; a failed union is redundant.
- Processing type `3` first maximizes shared connectivity before using exclusive edges.
- Both users can traverse the graph iff both Union-Find component counts become `1`.

## Edge Cases

- If either Alice or Bob remains disconnected, return `-1`.
- Duplicate connectivity edges are counted removable because their union fails.
- Node labels are converted from `1`-based input to `0`-based arrays.

## Complexity

- Time: $O(e \log e + e \alpha(n))$.
- Space: $O(n)$.

## Notes

- The type `3` branch uses bitwise `|` instead of logical `||` intentionally so both Union-Finds are updated.
