# Explanation

## Idea

- DFS from root to every leaf while maintaining the root-to-current path in a `StringBuilder`.
- At a leaf, reverse the path to get the leaf-to-root string.
- Keep the lexicographically smallest leaf string in `ans`.

## Why It Works

- Every valid answer corresponds to exactly one root-to-leaf path read backward.
- DFS visits every leaf path.
- Reversing at the leaf gives the required direction.
- Comparing each candidate with the current best leaves the smallest string.

## Edge Cases

- A single-node tree returns that node's character.
- The sentinel `"~"` is lexicographically after lowercase letters, so the first real candidate replaces it.
- The builder is reversed back and shortened during backtracking to preserve sibling paths.

## Complexity

- Time: $O(nh)$ in the worst case due to building/reversing path strings at leaves.
- Space: $O(h)$ recursion and path storage.
