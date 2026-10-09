## Idea
- Scan edges in input order, maintaining connected components with union-find and path compression.
- Join distinct roots; return the first edge whose endpoints already have the same root.

## Why It Works
- An edge between already-connected vertices closes the graph's unique cycle.
- The last input edge on that cycle is exactly the first cycle-closing edge during this scan. Removing it leaves the original connected graph acyclic, satisfying the requested tie-break.

## Edge Cases
- Edges outside the unique cycle never trigger the return.
- Labels are one-based, so the union-find arrays allocate n + 1 entries.

## Complexity
- O(n²) conservative worst-case time bound for n edges, since an individual find can traverse O(n) parent links.
- O(n) auxiliary space for arrays and the recursive find stack; path compression improves later searches.

## Notes
- Although a rank array is allocated, union never uses it and always attaches the first root to the second. Do not assume the inverse-Ackermann bound of ranked union plus compression; parent chains can be long.
