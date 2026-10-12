## Idea

- Sort both arrays and greedily match each smallest player with the first sufficient trainer.

## Why It Works

- Using the smallest sufficient trainer preserves larger capacities for harder players.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- O(n log n+m log m) time.
