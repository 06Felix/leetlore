## Idea
- Run BFS from each uncolored vertex, assigning its component's first vertex color one.
- Assign an uncolored neighbor the opposite color using XOR with three, which swaps colors one and two.
- Reject immediately if an edge joins equal-colored vertices.

## Why It Works
- Every discovered edge requires opposite endpoint colors, so a completed traversal gives a valid partition for that component.
- An equal-color conflict makes those requirements inconsistent. Starting BFS for every uncolored vertex checks disconnected components too.

## Edge Cases
- Isolated vertices and graphs with no edges are bipartite.
- Even cycles admit alternating colors; odd cycles create a conflict.

## Complexity
- O(V + E) time, scanning every vertex and adjacency entry.
- O(V) auxiliary space for colors and the BFS queue.
