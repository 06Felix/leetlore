# Explanation

## Idea

Use recursive postorder traversal for an N-ary tree. The helper visits every child first, then appends the current node value.

The answer list is stored as a field and filled during traversal.

## Why It Works

Postorder for an N-ary tree requires all children to appear before their parent. The loop recursively processes children in their stored order, then adds the parent.

This visits each reachable node once when child lists are non-null.

## Edge Cases

- A null root returns the initially empty answer list.
- Nodes with an empty child list are appended after the loop.
- Deep trees use recursion, with stack depth equal to tree height.

## Complexity

Time: `O(n)`.

Space: `O(h)` recursion stack, plus `O(n)` for the output list.

## Notes

The implementation returns immediately when `n.children == null`, so a node with a null child list is not appended. LeetCode's N-ary tree nodes normally provide an empty list for leaves; if a caller used `null` children for leaves, this implementation would miss those leaf values.
