# Explanation

## Idea

Use two stacks to read the linked-list digits from least significant to most significant without reversing the input lists.

Pop digits from both stacks, add the carry, and prepend each result digit to the answer list.

## Why It Works

The input lists store the most significant digit first, but addition starts from the least significant digit. Stacks reverse the traversal order.

Each loop iteration computes one output digit from the current two digits and carry. Prepending the new node restores most-significant-first order in the returned list.

The loop continues while either stack has digits or a carry remains.

## Edge Cases

- Different list lengths work because missing digits contribute `0`.
- A final carry creates a new leading node.
- `[0] + [0]` returns one zero node.

## Complexity

Time: `O(n + m)`.

Space: `O(n + m)` for the stacks and output list.
