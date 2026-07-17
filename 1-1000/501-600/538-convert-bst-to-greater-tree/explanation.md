# Explanation

## Idea

- Traverse the BST in reverse inorder: right subtree, node, left subtree.
- Keep `addSum`, the sum of all larger values already visited.
- Add `addSum` into the current node, then update `addSum` to the new node value.

## Why It Works

- Reverse inorder visits BST values from largest to smallest.
- By the time a node is processed, all greater values have already contributed to `addSum`.
- Updating the node in place with that sum produces the Greater Tree value.

## Edge Cases

- A null root returns null after no traversal.
- The largest node keeps its original value because `addSum` starts at `0`.
- Negative values are fine because the running sum can increase or decrease normally.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is tree height.
