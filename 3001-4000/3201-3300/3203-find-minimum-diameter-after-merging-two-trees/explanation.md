# Explanation

## Idea
- Build each tree's adjacency lists and use a recursive traversal to find its diameter.
- At each node, combine the two deepest child branches; keep the largest such path across the tree.
- Return $\max(d_1,d_2,\lceil d_1/2\rceil+\lceil d_2/2\rceil+1)$.

## Why It Works
- Any path has a highest node relative to the chosen root and uses at most two child branches there, so their largest combined length yields the diameter.
- An added edge preserves both original diameters. Its longest crossing path has length equal to the two chosen endpoints' eccentricities plus one.
- Choosing a center in each tree minimizes those eccentricities to the respective radii, $\lceil d/2\rceil$, achieving the formula.

## Edge Cases
- An empty edge list represents a singleton tree with diameter and radius zero.
- Connecting two singleton trees yields diameter one; a large original diameter can remain the limiting term after merging.

## Complexity
- Time: $O(n + m)$ to build and traverse the two trees.
- Auxiliary space: $O(n + m)$ as an upper bound for adjacency lists and recursion.

## Notes
- A path-shaped tree near the 100000-node limit risks overflowing Java's recursion stack. The existing recursive implementation is preserved.
