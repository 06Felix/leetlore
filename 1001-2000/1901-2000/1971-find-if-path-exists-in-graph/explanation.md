# Find if Path Exists in Graph

## Idea
- Initialize a disjoint-set structure with each vertex in its own component.
- Union the endpoints of every undirected edge, using recursive path compression in `find`, then compare the source and destination representatives.

## Why It Works
- An edge makes its two endpoints mutually reachable, so joining their components preserves exactly the connectivity implied by processed edges.
- After all edges are processed, vertices have the same representative exactly when an undirected path connects them.

## Edge Cases
- A vertex is reachable from itself, including an isolated vertex.
- Disconnected components keep different representatives; no traversal of absent edges is needed.

## Complexity
- $O(n+(E+1)\log n)$ amortized time is a conservative bound for path compression without rank balancing; an individual `find` can still take $O(n)$ time.
- $O(n)$ parent storage and up to $O(n)$ recursive stack space.

## Notes
- Despite its name, `unionByRank` does not track or use ranks: it always attaches one root to the other.
- Confirmed correctness/runtime risk: ordered edges `[0,1], [1,2], ..., [199998,199999]` followed by a query from zero to 199999 cause `StackOverflowError` on the checked JVM. This is a valid input within the constraints.
