## Idea
- Make one pass for strictly increasing runs and another for strictly decreasing runs.
- Extend the current length when the adjacent comparison succeeds; otherwise reset it to one. Keep the greatest length across both passes.

## Why It Works
- In each pass, the counter is the length of the longest qualifying subarray ending at the current position.
- Every qualifying subarray belongs to one of these runs, so the greatest counter covers both possible directions.

## Edge Cases
- Equal neighbors break both kinds of run.
- A singleton or an all-equal array returns one; a fully monotone array returns its length.

## Complexity
- O(n) time and O(1) auxiliary space.
