# Count Good Nodes in Binary Tree

## Idea

- Traverse the tree with DFS.
- Carry `cM`, the maximum value seen from the root to the parent of the current node.
- A node is good when `t.val >= cM`.
- Recurse into both children with the updated maximum `nM`.

## Why It Works

- The good-node condition depends only on the maximum ancestor value along the current root-to-node path.
- `nM = max(t.val, cM)` preserves exactly that path maximum for descendants.
- Each subtree returns its own good-node count, and the current node contributes `1` only when it satisfies the condition.

## Edge Cases

- A null child contributes `0`.
- The root is counted because the initial maximum is `Integer.MIN_VALUE`.
- Equal values are valid because the condition is "no greater value", so `>=` is correct.

## Complexity

- Time: $O(n)$ because each node is visited once.
- Space: $O(h)$ recursion stack for tree height `h`.

## Notes

- The recursive implementation can use $O(n)$ stack on a fully skewed tree.
