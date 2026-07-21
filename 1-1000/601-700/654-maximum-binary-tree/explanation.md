# Maximum Binary Tree

## Idea

- Recursively build a tree for a subarray range.
- Find the maximum value index in the current range.
- Create a node from that value.
- Build the left and right children from the ranges before and after the maximum index.

## Why It Works

- The problem definition chooses the maximum value as the root of each subarray.
- Values left of the maximum form the left subtree.
- Values right of the maximum form the right subtree.
- Recursing on those ranges exactly follows the construction rules.

## Edge Cases

- Empty ranges return `null`.
- A one-element range becomes a leaf.
- Strictly increasing or decreasing arrays create a skewed tree.

## Complexity

- Time: $O(n^2)$ worst case from scanning for the maximum in each recursive range.
- Space: $O(h)$ recursion stack for tree height `h`.
