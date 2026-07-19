# Explanation

Problem: [Construct Binary Search Tree from Preorder Traversal](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/)

## Idea

Read preorder with a shared index and recursive value bounds. A value belongs to the current subtree only if it falls inside that subtree's valid BST range.

## Why It Works

Preorder visits a root before its left and right subtrees, so the next unused value is the root of the current subtree if it satisfies the allowed bounds. The left subtree is then built with values below the root, and the right subtree with values above the root. If the next value is outside the current range, that subtree is empty and the index is left unchanged for an ancestor call. Because each value is consumed exactly once in preorder order, the constructed tree has the requested traversal and satisfies the BST property.

## Edge Cases

- A strictly increasing preorder creates only right children.
- A strictly decreasing preorder creates only left children.
- Values are unique, so inclusive bounds do not introduce duplicate ambiguity.

## Complexity

- Time: `O(n)`.
- Space: `O(h)` recursion stack, where `h` is the tree height.
