## Idea

- Sort both arrays. Match the smallest remaining player with the first trainer whose capacity is sufficient, skipping trainers that are too small.

## Why It Works

- A trainer too small for the smallest player cannot serve any remaining player. Using the smallest sufficient trainer leaves larger capacities for harder players; exchanging this match into an optimal assignment preserves its match count.

## Edge Cases

- Equal abilities and capacities can match. Stop when either array is exhausted.

## Complexity

- O(n log n + m log m) time and O(log n + log m) sorting stack space.

## Notes

- Both input arrays are sorted in place.
