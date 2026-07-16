# Lowest Common Ancestor of a Binary Search Tree

## Idea

- The implementation uses the BST ordering property.
- If both target values are smaller than `root.val`, the LCA must be in the left subtree.
- If both target values are larger than `root.val`, the LCA must be in the right subtree.
- Otherwise the current root is the split point, so it is the LCA.

## Why It Works

- In a BST, every left-subtree value is smaller than the root and every right-subtree value is larger.
- When both targets are on one side, any common ancestor below the root must also be on that side.
- When the root lies between the two target values, the targets are in different branches or one target is the root.
- That root is the lowest node that can contain both targets as descendants.

## Edge Cases

- If one target is an ancestor of the other, the ancestor is returned.
- The input guarantees both nodes exist and all values are unique.
- Recursion depth is proportional to the BST height.

## Complexity

- Time: $O(h)$, where `h` is the tree height.
- Space: $O(h)$ recursion stack.
