## Idea

- Use prefix sums and evaluate intervals reachable when starting from position start, considering both movement directions.

## Why It Works

- For every interval, the minimum steps needed by either turn order is checked; prefix sums then give its fruit total in O(1).

## Edge Cases

- Intervals clipped to the fruit positions and one-sided movement are handled.

## Complexity

- O(n) after sorting positions, with O(n) prefix space.
