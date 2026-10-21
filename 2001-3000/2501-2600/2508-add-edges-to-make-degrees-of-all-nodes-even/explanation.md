# Add Edges to Make Degrees of All Nodes Even

## Idea
- Build adjacency sets and collect odd-degree vertices, stopping after five because two new edges cannot fix more than four odd vertices.
- Accept zero odd vertices. For four, test the three pairings and require both new edges to be absent.
- For two odd vertices, scan every vertex for one adjacent to neither; this represents either a two-edge route through a distinct intermediate or a direct missing edge when the scanned vertex is one of the odd endpoints.

## Why It Works
- Each added edge flips the parity of exactly its two endpoints, restricting possible solutions to the listed odd-count cases.
- Four odd vertices require two disjoint pairings. With two odd vertices, the added edges must be their direct edge or a length-two path through a common intermediate.
- Adjacency-set checks prohibit repeated edges. For the two-odd case, choosing an endpoint succeeds only when the direct edge is absent; it denotes adding that single edge, not a self-loop.

## Edge Cases
- Disconnected graphs and isolated intermediate vertices are allowed.
- Five collected odd vertices means there are actually at least six, since an undirected graph has an even number of odd-degree vertices; rejection is safe.

## Complexity
- Expected $O(n+E)$ time using hash-based adjacency membership.
- $O(n+E)$ auxiliary space for degrees and adjacency sets.
