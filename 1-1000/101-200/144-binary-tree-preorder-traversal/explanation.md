# Explanation

Problem: [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)

## Idea

- Create an answer list and fill it with a recursive helper.
- For each node, append its value first, then visit the left subtree, then the right subtree.
- Return the filled list from `preorderTraversal`.

## Why It Works

- Preorder traversal is defined as root, left, right.
- The helper adds the current root before recursing, so each subtree is processed in preorder.
- The null check stops recursion at missing children and contributes no values.

## Edge Cases

- Empty tree returns an empty list.
- Single-node tree appends only that node's value.

## Complexity

- Time: $O(n)$, where `n` is the number of nodes.
- Space: $O(h)$ recursion stack, plus $O(n)$ for the returned list.
