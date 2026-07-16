# Explanation

## Idea

- Traverse the perfect binary tree recursively.
- For each node, connect its left child to its right child.
- If the node already has a `next`, connect its right child to the next node's left child.

## Why It Works

- In a perfect binary tree, a node's two children are adjacent on the next level.
- The next node's left child is exactly the neighbor after the current node's right child.
- Recursing after setting these links propagates the same rule to every lower level.

## Edge Cases

- An empty tree returns `null`.
- Leaf nodes have no children, so the link-setting checks skip them.
- The cross-parent link only exists when `root.next` is non-null.

## Complexity

- Time: $O(n)$ because each node is visited once.
- Space: $O(h)$ recursion stack, where $h$ is the tree height.
