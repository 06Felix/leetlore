## Idea

- Sort events, precompute the next compatible event, and use rolling DP by event count.

## Why It Works

- Each state skips or takes the event plus the previous layer at the next compatible index.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- O(n log n+nk) time, O(n) space.
