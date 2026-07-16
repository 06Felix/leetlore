# Binary Tree Level Order Traversal II

## Idea

- The implementation performs a standard breadth-first traversal with a queue.
- For each level, it records exactly `size` nodes currently in the queue.
- Their values are collected into `curr`, and their children are queued for the next level.
- After all levels are collected top-down, the result list is reversed.

## Why It Works

- Queue order preserves left-to-right traversal within each level.
- Capturing the queue size before processing a level prevents nodes from the next level from mixing into the current one.
- Reversing the completed top-down level list gives the required bottom-up order.

## Edge Cases

- A null root leaves the queue empty and returns an empty list.
- A single-node tree produces one level and reversing does not change it.
- Missing children are skipped before enqueueing.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the queue and output.
