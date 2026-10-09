## Idea
- First search for the target and record distances only for nodes on the root-to-target path.
- Traverse the whole tree again. Use a recorded distance at path nodes; elsewhere, increase the parent's distance by one and collect values at distance k.

## Why It Works
- The first traversal records the exact distance of each target ancestor.
- Every other subtree connects to the target through its nearest ancestor on that path, so propagating distance downward gives the unique tree-path length.
- The second traversal visits each node once and includes exactly those with the requested distance.

## Edge Cases
- k = 0 returns only the target; k beyond every node's distance returns an empty list.
- The target may be the root or a leaf, and the answer order is unrestricted.

## Complexity
- O(n) expected time with hash-map lookup.
- O(h) auxiliary space for the path map and recursion, plus O(n) worst-case output, where h is tree height.
