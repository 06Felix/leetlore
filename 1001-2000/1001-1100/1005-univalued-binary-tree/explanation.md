# Explanation

## Idea

- Use the root value as the required value for the whole tree.
- Recursively check the left and right subtrees.
- A null child is valid by default.

## Why It Works

- A tree is univalued exactly when every node equals the root value.
- The helper verifies the current node and both child subtrees.
- Combining checks with `&&` stops as soon as any different value is found.

## Edge Cases

- Single-node trees return `true`.
- Missing children return `true`.
- The problem guarantees `root` is non-null, so reading `root.val` is safe.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack.
