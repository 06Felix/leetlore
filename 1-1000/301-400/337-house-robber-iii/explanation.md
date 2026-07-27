# Explanation

## Idea

Do a postorder tree DP. For each node, return two values:

- `robRoot`: best amount if this node is robbed
- `notRobRoot`: best amount if this node is not robbed

## Why It Works

If a node is robbed, its children cannot be robbed, so the value is `node.val + left.notRobRoot + right.notRobRoot`.

If a node is not robbed, each child can independently be robbed or skipped, so the value takes the max state from each child.

The root answer is the larger of robbing or not robbing the root.

## Edge Cases

- Null children return `(0, 0)`.
- A leaf returns its own value when robbed and `0` when skipped.
- Zero-valued nodes are handled by the same max transitions.

## Complexity

Time: `O(n)`.

Space: `O(h)` recursion stack, where `h` is the tree height.
