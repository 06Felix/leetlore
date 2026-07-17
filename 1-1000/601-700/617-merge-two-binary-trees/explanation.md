# Explanation

## Idea

- Recursively merge corresponding nodes.
- If one side is null, return the other side directly.
- If both nodes exist, add `root2.val` into `root1.val` and merge children.

## Why It Works

- The merge rule says overlapping nodes should sum their values.
- Non-overlapping subtrees can be reused unchanged.
- Recursing on left and right children applies the same rule throughout the tree.

## Edge Cases

- Two null roots return null.
- If one whole tree is null, the other tree is returned.
- The implementation mutates and returns `root1` for overlapping nodes.

## Complexity

- Time: $O(n)$, where `n` is the number of visited overlapping/non-null positions.
- Space: $O(h)$ recursion stack.
