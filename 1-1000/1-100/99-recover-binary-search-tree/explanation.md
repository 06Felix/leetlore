# Recover Binary Search Tree

## Idea

- An inorder traversal of a valid BST should produce values in sorted order.
- The solution tracks the previous visited node, `pred`.
- Whenever the current value is smaller than `pred.val`, it records an inversion.
- The first bad previous node becomes `x`, and the current bad node becomes `y`; swapping their values repairs the tree.

## Why It Works

- Swapping two BST nodes creates one or two inversions in the inorder sequence.
- The first inversion identifies the larger swapped value as `x`.
- The last inversion identifies the smaller swapped value as `y`.
- Swapping `x.val` and `y.val` restores sorted inorder order without changing tree structure.

## Edge Cases

- Adjacent swapped nodes create only one inversion, and both `x` and `y` are set from it.
- Non-adjacent swapped nodes create two inversions, updating `y` on the second.
- Null child links are handled by the traversal base case.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is the tree height.
