# Explanation

## Idea

Generate all BSTs recursively for each value range. For every possible root value, recursively generate all left subtrees from smaller values and all right subtrees from larger values, then combine them.

## Why It Works

A BST over a range `[min, max]` is uniquely determined by its root value plus one valid left subtree from `[min, root - 1]` and one valid right subtree from `[root + 1, max]`.

The recursion tries every root and every left/right combination, so it produces all valid structures. The base case returns a single `null` subtree for an empty range, which lets leaf nodes and missing children be combined naturally.

## Edge Cases

- Empty ranges return a list containing `null`.
- `n == 0` returns an empty list, though the current constraints start at `1`.
- Each created root reuses generated child subtree references, which is accepted for LeetCode's returned-tree use.

## Complexity

Time: `O(C_n * n)` to build all Catalan-number trees.

Space: `O(C_n * n)` for the returned trees, plus recursion stack.
