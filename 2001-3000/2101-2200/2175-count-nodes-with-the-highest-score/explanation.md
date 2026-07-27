# Explanation

## Idea

Build child lists from the parent array, then run one DFS from the root. For each node, compute subtree sizes and the score produced by removing that node.

The score is the product of all remaining component sizes.

## Why It Works

When a node is removed, each child subtree becomes one component with size equal to that child's subtree size.

If the node is not the root, the nodes above it form one more component with size `n - subtreeSize`. The code multiplies by `1` when that outside component is empty, so the root case works naturally.

Tracking the maximum score and count during DFS gives the final answer.

## Edge Cases

- Leaves have no child components, only the outside component.
- The root has no outside component.
- Scores can exceed `int`, so the implementation uses `long`.

## Complexity

Time: `O(n)`.

Space: `O(n)`.
