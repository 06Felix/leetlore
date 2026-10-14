## Idea

- Run breadth-first search and gather a fixed queue-size batch into one output list before proceeding to the next level.

## Why It Works

- Processing parents from left to right and enqueuing each left child before its right child preserves within-level order. Queue-size snapshots separate consecutive depths exactly.

## Edge Cases

- Null root returns no levels; a one-node tree produces one singleton level.

## Complexity

- O(n) time, O(w) auxiliary queue space, and O(n) output space.
