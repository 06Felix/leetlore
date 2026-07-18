# Explanation

## Idea

- Recursively inspect each node.
- If the left child exists and is a leaf, add its value.
- Otherwise, recurse into the left subtree; always recurse into the right subtree.

## Why It Works

- A left leaf is recognized from its parent: it is the left child and has no children.
- Once such a node is counted, it should not be recursed into further.
- Right leaves are not counted because only left-child leaves qualify.

## Edge Cases

- A single root returns `0`.
- Missing children contribute `0`.
- Negative leaf values are added normally.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack.
