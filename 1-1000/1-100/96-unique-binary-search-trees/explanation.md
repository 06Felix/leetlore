# Explanation

## Idea

Use Catalan-number dynamic programming. `dp[i]` stores how many unique BST shapes can be built with `i` nodes.

For each tree size, the code tries every possible root position and multiplies the number of left and right subtree shapes.

## Why It Works

If the root has `j` nodes on the left, it has `i - j - 1` nodes on the right. Every left shape can pair with every right shape, giving `dp[j] * dp[i - j - 1]` trees for that root position.

Summing over all root positions counts every valid BST shape exactly once.

## Edge Cases

- `dp[0] = 1` represents an empty subtree.
- `dp[1] = 1` represents a single-node tree.
- `n <= 19`, so the final answer fits in `int` for this problem.

## Complexity

Time: `O(n^2)`.

Space: `O(n)`.
