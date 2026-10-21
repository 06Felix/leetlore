# Reverse Linked List

## Idea

- Keep ans as the reversed prefix. Save head.next, redirect head.next to ans, move ans to head, and continue with the saved next node.

## Why It Works

- At each step, ans contains exactly the already processed nodes in reverse order, while head starts the untouched suffix. Moving one node from that suffix to the front preserves the invariant until the reversed prefix is the whole list.

## Edge Cases

- An empty list returns null. A one-node list returns that same node.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- This is the iterative version; it modifies next pointers without allocating replacement nodes. The optional recursive alternative is not included in the submitted implementation.
