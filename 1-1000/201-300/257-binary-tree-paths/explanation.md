# Binary Tree Paths

## Idea

- The solution uses DFS with a shared `StringBuilder`.
- Before visiting a node, it records the builder's current length.
- It appends the current node value, and if the node is a leaf, stores the built path.
- Otherwise it appends `"->"` and recurses into both children.

## Why It Works

- DFS visits every root-to-leaf path.
- The builder contains exactly the current root-to-node path during each recursive call.
- Saving a path only at leaves matches the requirement to return root-to-leaf paths.
- Resetting the builder length after recursion backtracks cleanly for sibling paths.

## Edge Cases

- A single-node tree returns just that node value.
- Null children return immediately.
- Negative values would be appended correctly by `StringBuilder.append(int)`.

## Complexity

- Time: $O(nh)$ in the worst case due to path string creation, where `h` is tree height.
- Space: $O(h)$ recursion and builder state, plus output.
