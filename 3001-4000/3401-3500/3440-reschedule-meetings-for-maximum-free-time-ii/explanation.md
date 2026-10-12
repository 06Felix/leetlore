## Idea

- Compute gaps and combine adjacent gaps, adding the meeting duration when another gap can hold it.

## Why It Works

- A moved meeting either merges neighbors or frees its whole span elsewhere.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- O(n) time, O(n) space.
