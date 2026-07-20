# Longest ZigZag Path in a Binary Tree

## Idea

- DFS returns a small record `T` for each subtree.
- `leftMax` is the best ZigZag length starting at this node by moving left first.
- `rightMax` is the same but moving right first.
- `subtreeMax` stores the best ZigZag length anywhere inside the subtree.

## Why It Works

- If the path moves left from the current node, the next move must be right from the left child, so the length is `left.rightMax + 1`.
- The symmetric case gives `right.leftMax + 1`.
- The best answer in a subtree is the max of paths starting at the current node and answers already found in child subtrees.
- Returning `-1` for null children makes a missing edge contribute length `0` at a leaf.

## Edge Cases

- A single-node tree returns `0`.
- One-sided trees still work because missing child paths become `0`.
- The path may start at any node because `subtreeMax` is propagated upward.

## Complexity

- Time: $O(n)$ because each node is processed once.
- Space: $O(h)$ recursion stack for tree height `h`.

## Notes

- The helper record is a top-level class in the submitted solution; it stores only DFS aggregate values.
