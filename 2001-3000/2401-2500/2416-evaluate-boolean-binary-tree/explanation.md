# Explanation

Problem: [Evaluate Boolean Binary Tree](https://leetcode.com/problems/evaluate-boolean-binary-tree/)

## Idea

Evaluate the tree recursively. Leaf values `0` and `1` map directly to booleans, while internal values `2` and `3` apply OR and AND to the two child results.

## Why It Works

The tree definition gives the exact meaning of each node value. If `root.val < 2`, the node is a leaf and its boolean value is known immediately. Otherwise, the value of the subtree depends only on recursively evaluating its two children and applying the operator stored at the root. This matches the recursive definition of expression-tree evaluation.

## Edge Cases

- A single-node tree returns whether that leaf value is `1`.
- The full-tree constraint ensures operator nodes have both children.

## Complexity

- Time: `O(n)`.
- Space: `O(h)` recursion stack, where `h` is the tree height.
