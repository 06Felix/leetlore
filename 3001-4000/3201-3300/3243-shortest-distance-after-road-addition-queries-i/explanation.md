# Explanation

## Idea
- Maintain the current adjacency lists and shortest distances, initially equal to city indices along the original chain.
- Add each query's road permanently. If it improves the destination's distance, start a queue there and propagate strict improvements along existing roads.
- Record the updated distance to city `n - 1` after every query.

## Why It Works
- An improved path after adding one road must use that road; if its destination is not improved, no downstream path using it can improve either.
- Relaxing each outgoing road propagates any newly shorter path, and unchanged vertices already have valid propagated distances from earlier queries.
- Unit-length roads let the queue propagate improvements in increasing hop distance from the affected destination, while strict comparisons avoid unnecessary updates.

## Edge Cases
- A road that does not improve its endpoint is retained for potential use after a later upstream improvement.
- Direct shortcuts, overlapping shortcuts, and queries leaving the answer unchanged use the same propagation.

## Complexity
- Time: $O(q(n + q))$ as an upper bound for `q` single-source unit-edge propagations over the growing graph.
- Auxiliary space: $O(n + q)$ for adjacency lists, distances, and the queue, excluding output.
