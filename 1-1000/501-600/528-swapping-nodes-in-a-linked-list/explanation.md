# Swapping Nodes in a Linked List

## Idea

- Traverse the list once.
- When the kth node from the start is reached, store it as `p` and start pointer `q` at the head.
- Continue traversal; move `q` one step for every remaining node.
- At the end, `q` points to the kth node from the end, and the two values are swapped.

## Why It Works

- After `p` is found, the distance from the current traversal node to the end matches the distance `q` must advance from the head.
- Moving `q` in sync with the rest of the traversal positions it at the kth node from the end.
- The problem asks to swap values, so node links do not need to change.

## Edge Cases

- If both kth positions are the same node, swapping its value with itself is harmless.
- `k = 1` swaps head and tail values.
- The constraints guarantee `k` is valid.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
