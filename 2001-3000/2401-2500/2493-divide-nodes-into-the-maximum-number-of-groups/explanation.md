# Explanation

## Idea
- Check that every component is bipartite, returning minus one on a coloring conflict.
- Run BFS from each real node to compute its maximum distance plus one.
- For each connected component, take the largest such BFS level count and sum these component contributions.

## Why It Works
- Adjacent groups must have opposite index parity, so odd cycles make grouping impossible.
- In a bipartite graph, neighboring BFS distances differ by exactly one, making BFS levels a valid grouping. The best root produces diameter plus one levels.
- Any valid group's index span is bounded by path distances, so diameter plus one is also an upper bound. Disconnected components can use separate consecutive group ranges.

## Edge Cases
- An isolated node contributes one group.
- The dummy node zero is colored but excluded from level counts and component totals; odd-cycle components reject the whole graph.

## Complexity
- Time: $O(n(n+E))$ for BFS from each node, plus linear coloring and component traversal.
- Auxiliary space: $O(n+E)$ for adjacency, queues, colors, distances, and recursion.
