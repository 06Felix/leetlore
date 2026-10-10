## Idea
- Build an undirected dislike graph and BFS every uncolored component.
- Assign a neighbor the opposite color using XOR three, which swaps colors one and two; reject any edge joining equal colors.

## Why It Works
- Every dislike requires different endpoint groups, and BFS propagates exactly that constraint.
- A conflict shows two-group assignment is impossible. Without a conflict, all edges cross the two assigned groups, including in disconnected components.

## Edge Cases
- Isolated people and an empty dislike list cause no conflict.
- An odd cycle is rejected; even cycles can be colored consistently. Arrays include unused index zero for one-based labels.

## Complexity
- O(n + e) time for n people and e dislikes.
- O(n + e) auxiliary space for adjacency, colors, and the queue.
