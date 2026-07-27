# Explanation

## Idea

Use recursive postorder traversal. For each node, visit the left subtree, then the right subtree, then append the node value.

## Why It Works

Postorder is defined as left, right, root. The helper follows that order exactly.

Each recursive call fully processes a subtree before returning, so when a node is appended, all descendants that should come before it are already in the answer list.

## Edge Cases

- A null root returns an empty list.
- A leaf appends its value after two null child calls.
- The recursion depth is bounded by the tree height.

## Complexity

Time: `O(n)`.

Space: `O(h)` recursion stack, where `h` is the tree height.
