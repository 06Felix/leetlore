# Odd Even Linked List

## Idea

- Build odd-position and even-position chains using two dummy heads. Append each original node to its position-parity chain, connect the odd tail to the even head, and terminate the even tail.

## Why It Works

- Each chain receives nodes in their original order, so relative order within each parity is preserved. Joining odd before even gives exactly the requested ordering, while explicitly clearing the even tail removes leftover original links that could create a cycle.

## Edge Cases

- An empty list returns null. One-node and two-node lists retain their order.

## Complexity

- O(n) time and O(1) auxiliary space, including the two dummy nodes.

## Notes

- Parity is based on one-based list positions, not node values. The original nodes are relinked in place, meeting the stated time and space requirements.
