# 1569. Number of Ways to Reorder Array to Get Same BST

## Idea

- The first value of a sequence is the BST root, so it cannot move.
- Every later value belongs either to the left subtree or the right subtree based on that root.
- Recursively count valid orders for both subtrees, then interleave them while preserving each subtree's internal order.

## Why It Works

- If the left subtree has `L` values and the right subtree has `R`, there are `C(L + R, L)` ways to choose which positions belong to the left subtree.
- Each such choice keeps the relative order required by each subtree, so the BST remains unchanged.
- Therefore the answer for a subtree is `C(L + R, L) * leftWays * rightWays`.
- The original ordering is included in the count, so subtract one before returning.

## Edge Cases

- A subtree with at most two values has only one valid order.
- Pascal's triangle precomputes every needed combination modulo `1_000_000_007`.

## Complexity

- Time: `O(n^2)`
- Space: `O(n^2)` for combinations and recursive partitions

## Tags

- Divide and Conquer
- Binary Search Tree
- Combinatorics
- Dynamic Programming
