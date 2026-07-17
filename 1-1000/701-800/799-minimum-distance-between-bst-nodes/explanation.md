# Explanation

## Idea

- Traverse the BST in inorder order.
- Keep the previously visited node in `pN`.
- Update the answer with the difference between each current value and previous value.

## Why It Works

- Inorder traversal of a BST visits values in sorted order.
- The minimum absolute difference in a sorted list must occur between adjacent values.
- Comparing each node with only the previous inorder node is therefore enough.

## Edge Cases

- The first visited node has no previous node, so no difference is computed.
- The tree has at least two nodes by constraint, so an answer will be updated.
- Values are non-negative and inorder differences are non-negative.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is tree height.
