# Reorder List

## Idea
- For each recursive call, walk to the second-last node, detach the last node, and place it immediately after the current head.
- Recursively reorder the intervening list and attach it after that moved last node. Lists of at most two nodes return unchanged.

## Why It Works
- The required first two nodes are the current first and last nodes, which the call places in exactly that order.
- The remaining nodes must follow the same alternating pattern within the original interior list. Recursion produces that order without changing any values.
- Detaching the tail before recursion prevents it from appearing twice or creating a cycle.

## Edge Cases
- One- and two-node lists are already ordered; odd lengths eventually leave one middle node.
- The wrapper's local assignment does not replace the caller's head, but all changes happen through the original nodes' links.

## Complexity
- $O(n^2)$ time from repeatedly finding the tail of lists of lengths $n,n-2,n-4,\ldots$.
- $O(n)$ recursion stack; existing nodes are reused without allocating output nodes.

## Notes
- Practical limit: at 50,000 nodes this can make about 25,000 recursive calls and perform quadratic work, risking stack overflow or a time-limit failure. The implementation is not the linear-time split/reverse/weave algorithm.
