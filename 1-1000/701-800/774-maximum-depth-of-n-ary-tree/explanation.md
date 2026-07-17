# Explanation

## Idea

- Use depth-first recursion.
- A null root has depth `0`.
- For a real node, recursively compute the maximum depth among its children and add `1` for the current node.

## Why It Works

- Tree depth is defined by the longest path from the current node to any leaf.
- Each child subtree independently reports its own maximum depth.
- Taking the maximum child depth and adding one gives the maximum path through the current node.

## Edge Cases

- Empty tree returns `0`.
- Leaf nodes return `1`; the implementation handles both `children == null` and empty child lists.
- Deep trees rely on recursion depth, bounded by the problem at `1000`.

## Complexity

- Time: $O(n)$, visiting each node once.
- Space: $O(h)$ recursion stack, where `h` is tree height.
