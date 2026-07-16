# Explanation

Problem: [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)

## Idea

- Perform normal breadth-first traversal with a queue.
- For each level, read exactly the queue size at the start of that level.
- Collect node values left to right and enqueue non-null children for the next level.
- Reverse the collected level list at the end.

## Why It Works

- BFS visits nodes level by level from root to leaves.
- Capturing `size` before the inner loop isolates one complete level at a time.
- Children are enqueued in left-to-right order, so each level is stored in the required order.
- Reversing all levels transforms top-down BFS order into bottom-up order.

## Edge Cases

- A null root returns an empty list because nothing is enqueued.
- A single-node tree produces one level and reversing keeps it unchanged.
- Skewed trees work because each level may contain just one node.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the queue and output.
