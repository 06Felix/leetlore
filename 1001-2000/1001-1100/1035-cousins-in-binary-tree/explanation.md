# Explanation

## Idea

- Find the actual tree nodes for values `x` and `y`.
- Compute their depths from the root.
- Check that they have equal depth but are not siblings.

## Why It Works

- Cousins are defined as nodes on the same level with different parents.
- `findLevel` gives each target node's depth.
- `isSibling` detects whether both targets are immediate children of the same parent.
- The final condition matches the definition directly.

## Edge Cases

- If one target is a direct child of the root and the other is deeper, depths differ.
- Siblings at the same depth return `false`.
- Values are unique and guaranteed present, so node lookup succeeds.

## Complexity

- Time: $O(n)$, with several DFS passes.
- Space: $O(h)$ recursion stack.
