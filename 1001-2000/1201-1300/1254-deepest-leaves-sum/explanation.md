# Deepest Leaves Sum

## Idea

- Run breadth-first search level by level.
- Reset `ans` to zero at the start of each level.
- Sum all node values in the current level while enqueueing their children.

## Why It Works

- BFS processes nodes in increasing depth order.
- Since `ans` is reset for every level, after the loop finishes it contains the sum from the last level processed.
- The last processed level is the deepest level, so its sum is the required answer.

## Edge Cases

- A single-node tree returns the root value.
- Missing children are ignored before enqueueing.
- Uneven trees work because BFS groups by queue size at each depth.

## Complexity

- Time: `O(n)`, where `n` is the number of nodes.
- Space: `O(w)`, where `w` is the maximum level width.
