# Largest Color Value in a Directed Graph

## Idea
- Use Kahn's topological traversal and a 26-entry best color-count vector per node.
- When removing a node, increment its own color and propagate componentwise maxima to each outgoing neighbor; return `-1` unless all nodes were processed.

## Why It Works
- A node is processed only after all predecessors, so each stored color count is the best count on a path arriving there before adding that node.
- Different vector entries may describe different paths, which is valid because each color is optimized independently.
- Every path's largest color count appears when some node of that color is added. Maximizing these increments suffices for the answer.
- Unprocessed nodes after Kahn's traversal witness a directed cycle, including cycles in disconnected components.

## Edge Cases
- Isolated nodes contribute one; self-loops cause failure.
- Duplicate edges are counted and removed consistently in indegrees and propagation.

## Complexity
- Time: $O(26(n+m))$ for graph construction, traversal, and vector propagation.
- Space: $O(26n+m)$ for vectors, adjacency, indegrees, and queue.
