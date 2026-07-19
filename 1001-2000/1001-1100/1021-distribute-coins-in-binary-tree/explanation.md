# Explanation

Problem: [Distribute Coins in Binary Tree](https://leetcode.com/problems/distribute-coins-in-binary-tree/)

## Idea

Use postorder DFS. Each subtree returns its coin balance: positive means it has extra coins to send upward, negative means it needs coins from its parent.

## Why It Works

A node needs exactly one coin. After processing both children, their balances must cross the edges to the current node, costing `abs(leftBalance) + abs(rightBalance)` moves. The current subtree then has balance `(root.val - 1) + leftBalance + rightBalance`, which is the net number of coins it can pass to or request from its parent. Summing this edge cost over all nodes gives the minimum total moves because every surplus or deficit must cross its connecting edge exactly that many times.

## Edge Cases

- `null` contributes balance `0`.
- A tree that already has one coin per node produces zero balances and `0` moves.

## Complexity

- Time: `O(n)`.
- Space: `O(h)` recursion stack, where `h` is the tree height.
