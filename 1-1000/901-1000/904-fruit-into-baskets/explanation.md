## Idea

- Use a sliding window containing at most two fruit types.

## Why It Works

- When a third type enters, advance the left edge until only two types remain; the longest valid window is the answer.

## Edge Cases

- All equal fruit and fewer than two types work directly.

## Complexity

- O(n) expected time and O(1) type-map space.
