# Explanation

## Idea
- Reverse every edge so reaching all nodes from zero represents every original node reaching zero.
- Grow a visited set from zero with a min-heap of outgoing reversed edges, accepting the lightest edge to each newly reached node and tracking the largest accepted weight.
- Return that maximum if all nodes are reached, otherwise return minus one.

## Why It Works
- Each accepted edge reaches a new node from an earlier visited node. Reversing these discovery edges gives one outgoing edge per non-root node and a path to zero, satisfying every allowed `threshold >= 1`.
- For any weight limit that permits full reachability, an edge within that limit must cross from the reached set to its complement until the set is complete. The heap always selects an edge no heavier than that available edge, so the largest accepted weight is the minimum feasible limit.

## Edge Cases
- Nodes unreachable from zero in the reversed graph make the original requirement impossible.
- Parallel edges and duplicate heap entries are harmless: already visited destinations are skipped.

## Complexity
- Time: $O(n + E\log(E + 1))$ for `E` edges.
- Auxiliary space: $O(n + E)$ for reversed adjacency, visited flags, and the heap.

## Notes
- `threshold` is unused because choosing only discovery edges needs at most one outgoing edge per node in the original graph. Its stated positive lower bound makes this sufficient.
- The imported solution is C++; the explanation describes that implementation.
