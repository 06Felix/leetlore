## Idea
- Build the tree adjacency lists and DFS from Bob to root zero, recording arrival times only along the successful root path. Leave other times at n + 1.
- DFS every Alice root-to-leaf path. Add full amount if Alice arrives first, half if tied, and zero if Bob arrived first; return the greatest completed path income.

## Why It Works
- A tree gives Bob a unique route to zero, while Alice's arrival time at a node equals its root depth.
- Comparing these times implements each gate's opening rule. Evaluating every leaf considers every permitted Alice route, including routes with negative total income.

## Edge Cases
- Bob never visits nodes outside his root path, so Alice gets their full amounts.
- Even amounts make tied division exact for rewards and costs. Root zero is not treated as a leaf merely because it has one neighbor.

## Complexity
- O(n) time for adjacency construction and the two DFS traversals.
- O(n) auxiliary space for adjacency, times, and recursion.

## Notes
- A valid chain of 100,000 nodes can overflow the Java recursive stack in either traversal.
