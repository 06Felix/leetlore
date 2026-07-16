# Explanation

Problem: [Recover Binary Search Tree](https://leetcode.com/problems/recover-binary-search-tree/)

## Idea

- Inorder traversal of a valid BST should produce values in increasing order.
- Track the previous visited node, `pred`, while traversing inorder.
- Whenever `root.val < pred.val`, record the misplaced nodes.
- After traversal, swap the values of the two recorded nodes.

## Why It Works

- Swapping two BST nodes creates one or two inversions in the inorder sequence.
- The first inversion identifies the larger swapped node as `x`.
- The latest inversion identifies the smaller swapped node as `y`.
- Swapping `x.val` and `y.val` restores the inorder ordering without changing the tree structure.

## Edge Cases

- Adjacent swapped nodes create one inversion; non-adjacent swapped nodes create two.
- The recursion stops cleanly on null children.
- Node values can span the full integer range because comparisons are direct integer comparisons.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is the tree height.

## Notes

- This implementation uses recursive inorder traversal, so it does not satisfy the follow-up's constant-extra-space target.
