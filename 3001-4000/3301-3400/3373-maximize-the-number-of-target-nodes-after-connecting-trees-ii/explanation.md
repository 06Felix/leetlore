# Maximize the Number of Target Nodes After Connecting Trees II

## Idea
- DFS-color each tree by even or odd depth from node zero and count both classes.
- For a first-tree node, return its own parity-class size plus the larger parity-class size in the second tree.

## Why It Works
- In a tree, two nodes have even distance exactly when their root-depth parities match, so the first-tree contribution depends only on the queried node's class.
- A bridge adds one edge. Choosing its second-tree endpoint in the opposite class makes every node in the desired second-tree class have even distance from the query.
- Both classes exist because each tree has at least two nodes, so the larger class is always attainable; the bridge does not change first-tree distances.

## Edge Cases
- The query node counts itself, and highly unbalanced parity classes are handled without special cases.
- Each bridge choice is independent, so no shared endpoint across answers is required.

## Complexity
- Time: $O(n+m)$ for two DFS traversals and answer construction.
- Space: $O(n+m)$ for adjacency, parity arrays, output, and DFS stack.

## Notes
- Recursive DFS can reach 100,000 nested calls on a chain, posing a stack-overflow risk with typical JVM stack limits.
- No input arrays are modified.
