# Explanation

## Idea

- Search the cloned tree for a node whose value equals `target.val`.
- Use DFS over the cloned tree.
- Return the first matching cloned node.

## Why It Works

- The statement says all node values are unique.
- The cloned tree has the same structure and values as the original tree.
- Therefore, the node in the clone with `target.val` is exactly the corresponding node.

## Edge Cases

- If the current cloned subtree is null, it returns null.
- If the target is the root, the first comparison returns the cloned root.
- Skewed trees are handled by the same DFS.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack.

## Notes

- This implementation relies on the uniqueness constraint. If duplicate values were allowed, it would need to traverse original and cloned trees in parallel.
