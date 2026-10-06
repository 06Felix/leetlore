# Explanation

## Idea
- Count incoming edges to locate a node with two parents, if one exists.
- Without such a node, use disjoint sets to find the edge closing the underlying undirected cycle.
- With two parents, try removing each incoming edge in reverse input order and return the first whose remaining graph is cycle-free.

## Why It Works
- Adding one edge to a rooted tree can create a cycle, a second parent, or both.
- Removing an incoming edge from the two-parent node restores the indegree requirement. The remaining `n - 1` edges form a rooted tree exactly when their underlying graph is acyclic.
- If all indegrees are already at most one, removing the final edge closing the unique cycle restores a rooted tree. Reverse candidate order enforces the latest-edge tie rule in the two-parent case.

## Edge Cases
- A two-parent conflict without a cycle chooses the later incoming edge.
- When one incoming edge also participates in the cycle, only its removal passes the disjoint-set test.

## Complexity
- Time: $O(n^2)$ as a conservative worst-case bound for this implementation, with at most two full disjoint-set scans and potentially linear-depth finds.
- Auxiliary space: $O(n)$ for indegrees, parents, ranks, and worst-case find recursion.

## Notes
- The equal-rank branch attaches root `i` beneath `j` but increments `rank[i]`, the root that was attached. Connectivity remains correct, but the intended union-by-rank guarantee does not hold; the usual inverse-Ackermann bound should not be claimed for this code.
