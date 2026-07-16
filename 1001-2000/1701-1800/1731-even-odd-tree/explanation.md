# Even Odd Tree

## Idea

- The solution performs a level-order traversal with a queue.
- A boolean flag toggles the expected rule for each level.
- On even-indexed levels, values must be odd and strictly increasing.
- On odd-indexed levels, values must be even and strictly decreasing.

## Why It Works

- BFS processes nodes in left-to-right order within each level.
- `pval` stores the previous value on the current level, initialized to the correct extreme for that level's comparison.
- Any parity or ordering violation immediately proves the tree is not Even-Odd.
- Enqueuing children preserves the next level's left-to-right order.

## Edge Cases

- A single root is valid only if its value is odd.
- Strict comparisons reject equal values on the same level.
- Missing children do not affect ordering because only existing nodes are queued.

## Complexity

- Time: $O(n)$.
- Space: $O(w)$, where `w` is the maximum tree width.
