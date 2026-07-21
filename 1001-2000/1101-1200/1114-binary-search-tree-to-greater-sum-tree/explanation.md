# Binary Search Tree to Greater Sum Tree

## Idea

- Traverse the BST in reverse inorder: right, node, left.
- Keep `addSum`, the sum of all larger values already visited.
- Add `addSum` to the current node value, then update `addSum` to the node's new value.
- Return the original root after mutating nodes in place.

## Why It Works

- Reverse inorder visits BST values from largest to smallest.
- By the time a node is visited, every greater value has already been accumulated.
- Updating the node with `node.val + addSum` matches the greater-sum-tree definition.
- Updating `addSum` after that includes the current original value for smaller nodes.

## Edge Cases

- A null child simply returns.
- The largest node keeps its original value because `addSum` starts at `0`.
- A one-node tree is unchanged.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack for tree height `h`.
