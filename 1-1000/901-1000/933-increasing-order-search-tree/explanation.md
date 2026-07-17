# Explanation

## Idea

- Recursively rebuild the BST using inorder order.
- `convert(root, tail)` returns the head of the increasing tree for `root`, followed by `tail`.
- Each node's left pointer is cleared, and its right pointer links to the converted right subtree.

## Why It Works

- Inorder traversal of a BST visits nodes in increasing value order.
- Converting the left subtree with `root` as its tail places all smaller nodes before `root`.
- Then linking `root.right` to the converted right subtree followed by the original `tail` places larger nodes after `root`.

## Edge Cases

- A null subtree returns the provided tail.
- A single node becomes a valid one-node chain with `left = null`.
- The method reuses existing nodes instead of allocating new tree nodes.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is tree height.
