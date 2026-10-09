## Idea
- Build an undirected adjacency list with signs: an original edge u → v stores v at u and -u at v.
- DFS outward from city zero, skipping the parent. Count positive entries because those original roads point away from zero.

## Why It Works
- The roads form a tree, so each city has exactly one path to zero. Every edge must point toward the parent on that rooted path.
- A positive traversal entry represents an edge pointing toward the child and therefore needing reversal. Negative entries already point toward the parent, so counting the positive entries is both necessary and sufficient.

## Edge Cases
- Parent skipping prevents revisiting edges without a visited array.
- The signed encoding loses the sign of city zero, but this is harmless: such entries occur at zero's neighbors and are skipped as their parent edge.

## Complexity
- O(n) time and O(n) auxiliary space for adjacency lists and recursion.

## Notes
- A chain of up to 50,000 cities may overflow the Java recursive stack. The method counts reversals without changing the supplied roads.
