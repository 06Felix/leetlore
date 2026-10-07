# Explanation

## Idea
- Run a multi-source breadth-first search over states `[currentNode, visitedMask]`, starting at every node with its own bit set.
- Crossing an edge updates the current node and sets its bit in the mask.
- Count BFS layers and return upon reaching a mask containing all nodes; discard states already processed.

## Why It Works
- The state records everything needed for future choices, including visits already completed; revisiting a node remains allowed.
- Every edge costs one, so BFS finds the shortest state path. Starting all nodes at distance zero also minimizes over the unrestricted starting node.

## Edge Cases
- For one through three nodes, connectedness guarantees a spanning path of length `n - 1`, which the shortcut returns.
- Paths may reuse nodes and edges; a larger mask distinguishes progress even when the current node repeats.

## Complexity
- Time: $O((n + E)2^n)$ for `n` nodes and `E` undirected edges.
- Space: $O(n2^n)$ for visited flags; a conservative queue bound is $O((n + E)2^n)$ including duplicate enqueued states.

## Notes
- States are marked visited when dequeued, so multiple copies can enter the queue. Only the first processed copy expands its neighbors; later copies are skipped.
