# Explanation

## Idea
- Traverse root-left-right and record the maximum depth seen before entering each node.
- Reset the running maximum and repeat root-right-left, recording a second preceding-depth maximum.
- For each queried node, return the larger of its two recorded maxima.

## Why It Works
- A subtree occupies one contiguous block in a preorder traversal, and recording before entering its root excludes all of its descendants.
- Every node outside that subtree is either an ancestor or belongs to an off-path sibling subtree. Ancestors precede it in both traversals, while sibling subtrees precede it in one of the two opposite orders.
- The two recorded maxima therefore cover exactly the remaining nodes; their largest depth is the remaining tree height in edges.

## Edge Cases
- Removing a deepest subtree can leave a shallower branch or just the root, whose depth is zero.
- Queries are answered independently without changing the tree; unique labels index the result tables directly.

## Complexity
- Time: $O(n + q)$ for two traversals and `q` constant-time answers.
- Auxiliary space: two fixed 100001-entry arrays plus $O(h)$ recursion stack, excluding the output.

## Notes
- Despite its name, `postO` is root-right-left preorder, not postorder.
- `mx` is reset between traversals but not before the first traversal on a later call, so instance reuse can pollute answers. Deep skewed trees can exhaust the Java stack.
