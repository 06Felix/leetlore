# Implement Queue using Stacks

## Idea

- Push new entries onto s1. When peek needs an element and s2 is empty, move every entry from s1 to s2; pop then removes the top of s2. The queue is empty only when both stacks are empty.

## Why It Works

- Moving the entire input stack reverses newest-first order into oldest-first order. Existing s2 entries must be consumed before moving newer arrivals, so its top always represents the FIFO front.

## Edge Cases

- New pushes do not disturb older values still in s2. Valid-operation guarantees ensure peek and pop are never called on an empty queue.

## Complexity

- Amortized O(1) per operation, O(n) worst-case for a transfer-triggering peek or pop, and O(n) storage.

## Notes

- Every value is pushed to s1, moved once to s2, and popped once at most. Only standard stack operations are used, meeting the follow-up requirement.
