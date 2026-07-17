# Explanation

## Idea

- Use postorder DFS to compute each subtree sum.
- For each node, compute left and right subtree sums first.
- Add `abs(leftSum - rightSum)` to the running answer.

## Why It Works

- A node's tilt depends only on the total values in its left and right subtrees.
- Postorder traversal gives those two sums before processing the current node.
- Returning `root.val + leftSum + rightSum` lets the parent compute its own tilt.

## Edge Cases

- A null child contributes sum `0`.
- Leaf nodes add tilt `0`.
- Negative node values are handled because subtree sums and absolute difference use `int`; constraints keep totals small enough.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is tree height.
