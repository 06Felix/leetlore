# Middle of the Linked List

## Idea

- The solution uses slow and fast pointers.
- `slow` advances one node at a time.
- `fast` advances two nodes at a time.
- When `fast` reaches the end, `slow` is at the middle.

## Why It Works

- Since `fast` moves twice as quickly, `slow` has traveled half the list length when `fast` finishes.
- For odd length, `slow` lands on the only middle node.
- For even length, the loop continues until `fast` becomes `null`, leaving `slow` on the second middle node.

## Edge Cases

- A single-node list returns the head.
- A two-node list returns the second node.
- The loop checks both `fast` and `fast.next` before moving two steps.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
