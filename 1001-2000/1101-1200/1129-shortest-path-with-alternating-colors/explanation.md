# Shortest Path with Alternating Colors

## Idea
- Build separate red and blue adjacency lists. BFS states contain a node and the color used to reach it; the next edge must have the opposite color.
- Seed node zero with both previous-color possibilities so either starting color is allowed.
- Use two visited bits per vertex and set its answer on the first arrival through either color.

## Why It Works
- Alternating paths in the original graph correspond to ordinary paths through the expanded `(node, last color)` state graph.
- BFS explores these unit-length transitions by distance, so the first arrival at a node is its shortest valid alternating-path distance.
- Keeping separate color visits permits a necessary later arrival through the other color while preventing repeated exploration of the same state.

## Edge Cases
- Self-loops and parallel edges are safe because states are marked when enqueued.
- Node zero has distance zero; unreachable nodes retain `-1`. The initial zero states are not marked, so they may be enqueued once more without changing correctness.

## Complexity
- $O(n+R+B)$ time and auxiliary space for red and blue edge counts $R,B$.
- Each colored state is explored once, apart from the constant number of initial-state repeats.
