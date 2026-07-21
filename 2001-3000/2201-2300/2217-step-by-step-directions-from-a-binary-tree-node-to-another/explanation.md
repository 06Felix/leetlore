# Step-By-Step Directions From a Binary Tree Node to Another

## Idea

- Find the path from root to `startValue` and root to `destValue`.
- The DFS appends directions while unwinding, so each path is stored from target back to root.
- Remove the common suffix, which represents the shared path from root to the LCA.
- Use `U` for the remaining start path and reverse the remaining destination path.

## Why It Works

- The common root-to-LCA portion appears as a common suffix because paths are reversed.
- After removing it, each remaining character in the start path means one upward move to the LCA.
- The destination path must be traversed from LCA down to destination, so it is reversed.
- Combining those two pieces gives the shortest route through the LCA.

## Edge Cases

- If the start is an ancestor of destination, the `U` part is empty.
- If the destination is an ancestor of start, the downward part is empty.
- Node values are unique, so each DFS target path is unambiguous.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack plus path strings.
