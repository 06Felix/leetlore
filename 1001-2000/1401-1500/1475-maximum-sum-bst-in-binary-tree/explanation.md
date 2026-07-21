# Explanation

Problem: [Maximum Sum BST in Binary Tree](https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/)

## Idea

- Do a postorder traversal.
- For each subtree, return whether it is a BST, its minimum value, maximum value, and total sum.
- A node forms a BST if both children are BSTs and `left.max < node.val < right.min`.
- When a BST is found, update the global best sum.

## Why It Works

- Postorder traversal computes child summaries before deciding whether the current subtree is valid.
- The BST condition for a subtree depends only on both child subtrees being BSTs and the current value fitting between their boundary values.
- If the condition holds, the subtree sum is exactly `left.sum + node.val + right.sum`, so it is safe to compare against the answer.
- Invalid subtrees return a non-BST marker, preventing ancestors from using them as valid BST children.

## Edge Cases

- Null children are treated as valid BSTs with sentinel min/max bounds.
- Negative-valued trees are handled because the answer starts at `0`, allowing the empty BST choice required by the problem.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion depth, where `h` is tree height.

## Notes

- The helper summary type `T` is declared as a top-level class in the solution file.
