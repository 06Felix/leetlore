# Explanation

## Idea

- Try every node in `root` as the possible start of `subRoot`.
- Helper `eq(a, b)` checks whether two trees match exactly in structure and values.
- Return true if any starting node matches.

## Why It Works

- A subtree must begin at some node in the main tree.
- `isSubtree` recursively visits every candidate node.
- For each candidate, `eq` enforces both value equality and matching left/right child structure.

## Edge Cases

- A null candidate root cannot contain non-null `subRoot`, so it returns `false`.
- Exact whole-tree matches are found by the first `eq(root, subRoot)` call.
- Structural mismatches return `false` even if some values match.

## Complexity

- Time: $O(nm)$ in the worst case, where `n` is nodes in `root` and `m` in `subRoot`.
- Space: $O(h + s)$ recursion depth during nested checks.
