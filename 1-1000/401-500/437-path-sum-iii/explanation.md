# Explanation

Problem: [Path Sum III](https://leetcode.com/problems/path-sum-iii/)

## Idea

- Treat every node as a possible path start.
- `pathSum` counts paths starting at the current root, then recurses into the left and right subtrees to choose other starts.
- `count` walks downward from one start node while subtracting node values from the remaining target.
- Use `long` for the remaining sum to avoid overflow from large node values.

## Why It Works

- Every valid path has exactly one highest node, which is its start in a downward traversal.
- The outer recursion visits every node as that possible highest node.
- For a fixed start, `count` explores every downward path and counts it exactly when the remaining sum equals the current node value.
- Summing those counts over all starts counts every valid path once.

## Edge Cases

- Empty trees return `0`.
- Negative values are handled because the recursion uses exact remaining sums, not monotonic pruning.

## Complexity

- Time: $O(nh)$, worst-case $O(n^2)$ on a skewed tree.
- Space: $O(h)$ recursion depth, where `h` is tree height.

## Notes

- A prefix-sum map can improve this to $O(n)$, but this implementation uses the direct nested DFS.
