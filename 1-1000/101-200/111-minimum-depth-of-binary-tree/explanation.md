# Explanation

Problem: [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

## Idea

- Use recursion to compute the minimum depth of each subtree.
- An empty subtree contributes depth `0`.
- If only one child exists, the answer must continue through that child; if both exist, take the smaller child depth.

## Why It Works

- A leaf has both child depths equal to `0`, so it returns `1`.
- A missing child is not a valid root-to-leaf path, so when one side is `0`, the implementation returns `1 +` the other side.
- When both children exist, the nearest leaf below the current node is the nearer of the two child subtrees.

## Edge Cases

- Empty tree returns `0`.
- A skewed tree follows the only available child path instead of incorrectly choosing the missing side.

## Complexity

- Time: $O(n)$, where `n` is the number of nodes.
- Space: $O(h)$ recursion stack, where `h` is the tree height.
