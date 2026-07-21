# All Ancestors of a Node in a Directed Acyclic Graph

## Idea

- Build adjacency lists from each node to its outgoing neighbors.
- For each node `i`, run DFS and treat `i` as the current `ancestor`.
- Whenever DFS reaches a neighbor `v`, append `ancestor` to `ans[v]`.
- Use a fresh `vis` array for each ancestor DFS to avoid duplicate visits in that traversal.

## Why It Works

- If DFS from `ancestor` reaches `v`, then `ancestor` can reach `v`, so it is an ancestor.
- Running the search once from every node discovers every reachable descendant relation.
- Iterating ancestors from `0` to `n - 1` appends ancestors to each answer list in ascending order.
- `vis` prevents adding the same ancestor to the same node through multiple paths.

## Edge Cases

- Nodes with no incoming reachable sources keep empty lists.
- Nodes with multiple paths from one ancestor still receive that ancestor once.
- The DAG constraint avoids cycles, though `vis` also guards each DFS.

## Complexity

- Time: $O(n(n + e))$ in the worst case.
- Space: $O(n + e)$ for adjacency plus DFS state, excluding output.

## Notes

- The solution uses `graph` as the adjacency variable name; the explanation describes the actual implementation.
