# Explanation

## Idea

- Run DFS from the root while carrying the remaining target sum.
- Keep one mutable `path` list for the current root-to-node path.
- When a leaf value equals the remaining sum, copy the current path into the answer.

## Why It Works

- Subtracting each visited node value turns the check at a leaf into `root.val == sum`.
- DFS explores every root-to-leaf path exactly once.
- The implementation backtracks by removing the last value after each subtree, so sibling paths do not share stale values.
- Copying `path` before storing it protects accepted answers from later backtracking changes.

## Edge Cases

- A `null` root returns an empty result.
- Negative values are handled naturally because the remaining sum is arithmetic, not monotonic pruning.
- Only leaves are accepted, so partial paths with the target sum are ignored.

## Complexity

- Time: $O(nh)$ in the worst case because each accepted path copy can take up to tree height $h$.
- Space: $O(h)$ recursion/path space, plus output storage.
