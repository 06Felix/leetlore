# Maximize the Number of Target Nodes After Connecting Trees I

## Idea
- Build both trees and run depth-limited DFS from every node.
- For each first-tree node, add its radius-`k` count to the largest radius-`k - 1` count obtainable from any second-tree node.

## Why It Works
- The added bridge cannot change distances within the first tree because it is the only connection to the second tree.
- Connecting directly from the queried node uses only one edge to reach the second tree; connecting elsewhere wastes distance budget and cannot improve its contribution.
- The best bridge endpoint in the second tree maximizes its remaining-radius count, independently for every query.

## Edge Cases
- `k = 0` counts only the queried node and skips the second-tree search.
- DFS excludes the parent to avoid returning along an edge; sufficiently large radii count the entire corresponding tree.

## Complexity
- Time: $O(n^2+m^2)$ worst case for $n$ and $m$ tree nodes.
- Space: $O(n+m)$ for adjacency, output, and recursive traversal depth.

## Notes
- The variables `n1` and `n2` store edge counts; the allocated node counts are one larger.
- Recursion follows tree depth, up to 1000 nodes under these constraints.
