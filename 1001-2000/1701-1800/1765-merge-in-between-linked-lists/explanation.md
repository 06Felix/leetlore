# Explanation

## Idea

- Walk `list1` to the node before index `a`.
- Continue walking to the node after index `b`.
- Connect the node before `a` to the head of `list2`, then connect the tail of `list2` to the node after `b`.

## Why It Works

- Removing `[a, b]` means the predecessor of `a` should skip directly to the successor of `b`.
- Inserting `list2` in between replaces that skipped segment.
- Finding the tail of `list2` allows the final connection back to the remaining suffix of `list1`.

## Edge Cases

- Constraints guarantee `a >= 1`, so there is always a predecessor node.
- `list2` has at least one node, so its tail exists.
- Removing through index `b` leaves the node after `b`, because `b < list1.length - 1`.

## Complexity

- Time: $O(n + m)$ in the walked portions of both lists.
- Space: $O(1)$.
