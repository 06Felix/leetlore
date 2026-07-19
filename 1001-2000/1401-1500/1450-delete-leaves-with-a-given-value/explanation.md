# Explanation

Problem: [Delete Leaves With a Given Value](https://leetcode.com/problems/delete-leaves-with-a-given-value/)

## Idea

Process children before their parent. After recursively cleaning the left and right subtrees, delete the current node only if it has become a leaf and its value equals `target`.

## Why It Works

A parent can become a removable leaf only after its children have already been removed. The postorder recursion guarantees that both child links are replaced with their cleaned versions before checking the current node. If the current node is then a target-valued leaf, returning `null` deletes it from its parent. Otherwise returning the node preserves it with cleaned children.

## Edge Cases

- If the original root is eventually removed, the method returns `null`.
- Non-leaf target-valued nodes are kept until their children are processed.

## Complexity

- Time: `O(n)`.
- Space: `O(h)` recursion stack, where `h` is the tree height.
