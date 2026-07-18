# Explanation

## Idea

- Use postorder DFS.
- Each recursive call returns two values: subtree node count and subtree sum.
- For each node, compare `sum / count` with `node.val`.

## Why It Works

- A node's subtree average depends on all descendants, so children must be processed first.
- Combining left and right `(count, sum)` with the current node gives the exact subtree totals.
- Integer division floors the average, matching the statement.
- Incrementing `ans` on equality counts each valid node once.

## Edge Cases

- Leaf nodes always match their own average.
- Null children contribute nothing.
- Sums fit in `int` under constraints.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack.
