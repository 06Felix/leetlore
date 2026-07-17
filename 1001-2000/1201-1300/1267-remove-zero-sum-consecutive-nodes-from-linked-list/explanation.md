# Remove Zero Sum Consecutive Nodes from Linked List

## Idea

- The implementation recursively searches for a zero-sum prefix.
- It walks from the current head while accumulating `sum`.
- If the running sum becomes zero, it removes that whole prefix and restarts from `cur.next`.
- If no zero-sum prefix starts at the current head, it recursively cleans `head.next`.

## Why It Works

- Any zero-sum sequence starting at the current head can be removed immediately.
- After removing such a prefix, earlier structure changes, so restarting on the remaining list is correct.
- If no zero-sum prefix starts at `head`, then `head` must remain, and all removable sequences must be in the suffix.
- Recursively applying the same logic removes zero-sum ranges until none remain.

## Edge Cases

- A null head returns null.
- A zero-sum sequence at the very start updates the head.
- Multiple removals are handled by recursive restart.

## Complexity

- Time: $O(n^2)$ in the worst case due to repeated scans.
- Space: $O(n)$ recursion stack.

## Notes

- A prefix-sum hash map can solve this in linear time, but this note describes the submitted recursive implementation.
