# Find Bottom Left Tree Value

## Idea

- The DFS tracks the current level.
- `t` stores the deepest level seen so far.
- Because the traversal visits the left child before the right child, the first node reached at a new depth is the leftmost node at that depth.
- When a deeper level is first seen, `ans` is updated to that node's value.

## Why It Works

- DFS explores all nodes and records depth for each one.
- Left-first traversal guarantees the first node encountered at any depth is the leftmost node on that row.
- Updating only when `lvl > t` preserves the first value at the deepest level.
- After traversal, `ans` holds the leftmost value of the last row.

## Edge Cases

- A single-node tree updates `ans` at level `1`.
- Missing children are skipped by the null base case.
- Negative node values work because `ans` is assigned from node values directly.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack.
